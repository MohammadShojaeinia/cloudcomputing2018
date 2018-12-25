package ir.shojaeinia.services;

import ir.shojaeinia.models.Sentence;

import java.util.List;

public interface SentenceService {

    Sentence save(Sentence sentence);

    Iterable<Sentence> findAll();

}