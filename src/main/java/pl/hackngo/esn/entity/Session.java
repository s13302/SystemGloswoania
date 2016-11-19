package pl.hackngo.esn.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Created by rpi on 19.11.16.
 */
@Entity
public class Session {

    @Id
    private Long id;

    @Column(nullable = false)
    private String QR;

    private String nazwa;

    private Date startDate;

    @Column(nullable = false)
    private Double kworum = 0.5;

    @OneToMany
    @JoinColumn(name = "session_id")
    private Collection<Question> questions = new ArrayList<>();

    @ManyToMany
    @JoinColumn
    private Collection<User> users;

    public Session() {

    }

    public Session(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQR() {
        return QR;
    }

    public void setQR(String QR) {
        this.QR = QR;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Double getKworum() {
        return kworum;
    }

    public void setKworum(Double kworum) {
        this.kworum = kworum;
    }

    public Collection<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void setQuestions(Collection<Question> questions) {
        this.questions = questions;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", QR='" + QR + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", startDate=" + startDate +
                ", kworum=" + kworum +
                '}';
    }
}
