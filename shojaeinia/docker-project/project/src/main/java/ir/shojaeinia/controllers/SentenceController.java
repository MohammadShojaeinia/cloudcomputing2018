package ir.shojaeinia.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import ir.shojaeinia.models.Sentence;
import ir.shojaeinia.services.SentenceService;

@RestController
@RequestMapping("/sentence")
public class SentenceController {

    @Autowired
    private SentenceService sentenceService;

    @ApiOperation(value = "Get a sentence", response = ArrayList.class)
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public ArrayList<Sentence> getSentences() {
        return (ArrayList<Sentence>) sentenceService.findAll();
    }
}