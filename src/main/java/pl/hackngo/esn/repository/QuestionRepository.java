package pl.hackngo.esn.repository;

import org.springframework.data.repository.Repository;

import pl.hackngo.esn.entity.Question;

public interface QuestionRepository extends Repository<Question, Long> {

	Question save(Question q);
}
