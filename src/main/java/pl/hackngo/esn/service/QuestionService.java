package pl.hackngo.esn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.hackngo.esn.entity.Question;
import pl.hackngo.esn.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	public Question add(Question q) {
		return questionRepository.save(q);
	}

	public Question update(Question q) {
		return questionRepository.save(q);
	}

}
