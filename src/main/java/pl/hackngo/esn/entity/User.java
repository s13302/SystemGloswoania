package pl.hackngo.esn.entity;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class User {

	@Id
	private Long id;

	@Column(nullable = false)
	private String login;

	@Column(nullable = false)
	private byte[] password;

	@ManyToMany
	@JoinColumn
	private Collection<Question> questions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public byte[] getPassword() {
		return password;
	}

	public void setPassword(byte[] password) {
		this.password = password;
	}

	public Collection<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Collection<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + Arrays.toString(password) + "]";
	}

}
