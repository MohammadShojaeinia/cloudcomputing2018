let mqtt = require('mqtt')
let client = mqtt.connect('mqtt://192.168.99.100')

let idx = 0
cities = ["Shiraz", "Tehran", "Isfahan", "Damghan", "Mashhad", "Tabriz", "Ahwaz"];

function randomTemp() {
    return "" + (Math.floor(Math.random() * 50) + (-20));
}

function randomHumidity() {
    return "" + (Math.floor(Math.random() * 0) + 100);
}

function randomCity() {
    return cities[Math.floor(Math.random() * 7)];
}

client.on('connect', function () {
    console.log("connected!");
    setInterval(function () {
        let mess = {
            "Id": idx++,
            "Temperature": randomTemp(),
            "Humidity": randomHumidity(),
            "time": Date.now(),
            "City": randomCity()
        };

        try {
            client.publish('iotdata', JSON.stringify(mess));
        } catch (err) {
            console.log(err);
        }
    }, 3000);
});

client.subscribe('iotdata', { qos: 1 });

client.on('message', function (topic, message) {
    console.log(message.toString())
});
