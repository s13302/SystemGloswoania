package pl.hackngo.esn.repository;

import org.springframework.data.repository.Repository;

import pl.hackngo.esn.entity.Question;
import pl.hackngo.esn.entity.Session;

import java.util.Collection;

public interface QuestionRepository extends Repository<Question, Long> {

	Question findById(Long id);

	Collection<Question> findBySession(Session session);

	Question save(Question q);
}
