package pl.hackngo.esn.repository;

import org.springframework.data.repository.Repository;
import pl.hackngo.esn.entity.Answer;
import pl.hackngo.esn.entity.Question;

import java.util.Collection;

/**
 * Created by rpi on 20.11.16.
 */
public interface AnswerRepository extends Repository<Answer, Long> {

    Answer findById(Long id);

    Collection<Answer> findByQuestion(Question question);

}
