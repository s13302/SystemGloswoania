package pl.hackngo.esn.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Results {

	@Id
	private Long id;

	@ManyToOne
	@JoinColumn
	private User user;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Answer answer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Results{" +
				"id=" + id +
				", user=" + user +
				", answer=" + answer +
				'}';
	}
}
