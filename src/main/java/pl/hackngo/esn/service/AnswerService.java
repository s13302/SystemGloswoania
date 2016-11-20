package pl.hackngo.esn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackngo.esn.entity.Answer;
import pl.hackngo.esn.entity.Question;
import pl.hackngo.esn.repository.AnswerRepository;

import java.util.Collection;

/**
 * Created by rpi on 20.11.16.
 */
@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public Collection<Answer> loadAll() {
        return answerRepository.findAll();
    }

    public Answer loadById(Long id) {
        return answerRepository.findById(id);
    }

    public Collection<Answer> loadByQuestion(Question question) {
        return answerRepository.findByQuestion(question);
    }

    public Answer save(Answer answer) {
        answer.setId(null);
        return answerRepository.save(answer);
    }

    public Answer update(Long id, Answer answer) {
        answer.setId(id);
        return answerRepository.save(answer);
    }

}
