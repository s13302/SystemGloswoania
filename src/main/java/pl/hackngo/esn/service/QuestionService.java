package pl.hackngo.esn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.hackngo.esn.entity.Question;
import pl.hackngo.esn.entity.Session;
import pl.hackngo.esn.repository.QuestionRepository;

import java.util.Collection;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	public Collection<Question> loadAll() {
		return questionRepository.findAll();
	}

	public Question loadById(Long id) {
		return questionRepository.findById(id);
	}

	public Collection<Question> loadBySession(Session session) {
		return questionRepository.findBySession(session);
	}

	public Question save(Question question) {
		question.setId(null);
		return questionRepository.save(question);
	}

	public Question update(Long id, Question question) {
		question.setId(id);
		return questionRepository.save(question);
	}

}
