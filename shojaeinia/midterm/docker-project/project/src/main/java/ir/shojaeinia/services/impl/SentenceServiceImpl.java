package ir.shojaeinia.services.impl;

import ir.shojaeinia.models.Sentence;
import ir.shojaeinia.repositories.SentenceRepository;
import ir.shojaeinia.services.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SentenceServiceImpl implements SentenceService {

    @Autowired
    SentenceRepository sentenceRepository;

    @Override
    public Sentence save(Sentence sentence) {
        return sentenceRepository.save(sentence);
    }

    @Override
    public Iterable<Sentence> findAll() {
        return sentenceRepository.findAll();
    }

}
