package pl.hackngo.esn.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Question {

	@Id
	private Long id;

	@Column(nullable = false)
	private boolean isPublic;

	@Column(nullable = false)
	private String text;

	private int time = 0;

	private Date startTime;

	@OneToMany
	@JoinColumn
	private Collection<Answer> answers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Collection<Answer> getAnswers() {
		return answers;
	}

	public void addAnswer(Answer answer) {
		this.answers.add(answer);
	}

	public void setAnswers(Collection<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", isPublic=" + isPublic + ", text=" + text + ", time=" + time + ", startTime="
				+ startTime + "]";
	}

}
