package pl.hackngo.esn.entity;

import javax.persistence.*;

@Entity
public class Answer {

	@Id
	private Long id;

	@Column(nullable = false)
	private String text;

	@JoinColumn
	@ManyToOne
	private Question question;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", text=" + text + "]";
	}

}
