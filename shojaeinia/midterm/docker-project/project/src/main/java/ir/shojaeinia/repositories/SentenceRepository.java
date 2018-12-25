package ir.shojaeinia.repositories;

import ir.shojaeinia.models.Sentence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentenceRepository extends CrudRepository<Sentence, Long>{
}