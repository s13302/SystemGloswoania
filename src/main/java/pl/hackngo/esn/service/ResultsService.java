package pl.hackngo.esn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackngo.esn.entity.Answer;
import pl.hackngo.esn.entity.Results;
import pl.hackngo.esn.entity.User;
import pl.hackngo.esn.repository.ResultsRepository;

import java.util.Collection;

/**
 * Created by rpi on 20.11.16.
 */
@Service
public class ResultsService {

    @Autowired
    private ResultsRepository resultsRepository;

    public Collection<Results> loadAll() {
        return resultsRepository.findAll();
    }

    public Results loadById(Long id) {
        return resultsRepository.findById(id);
    }

    public Collection<Results> loadByUser(User user) {
        return resultsRepository.findByUser(user);
    }

    public Collection<Results> loadByAnswer(Answer answer) {
        return resultsRepository.findByAnswer(answer);
    }

    public Results save(Results results) {
        results.setId(null);
        return resultsRepository.save(results);
    }

}
