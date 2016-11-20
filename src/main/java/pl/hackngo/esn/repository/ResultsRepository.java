package pl.hackngo.esn.repository;

import org.springframework.data.repository.Repository;
import pl.hackngo.esn.entity.Answer;
import pl.hackngo.esn.entity.Results;
import pl.hackngo.esn.entity.User;

import java.util.Collection;

/**
 * Created by rpi on 20.11.16.
 */
public interface ResultsRepository extends Repository<Results, Long> {

    Results findById(Long id);

    Collection<Results> findByUser(User user);

    Collection<Results> findByAnswer(Answer answer);

}
