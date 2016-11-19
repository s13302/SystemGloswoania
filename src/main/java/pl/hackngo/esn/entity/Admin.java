package pl.hackngo.esn.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	private long Id;

	@Column(nullable = false)
	private String login;

	@Column(nullable = false)
	private byte[] password;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
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

	@Override
	public String toString() {
		return "Admin [Id=" + Id + ", login=" + login + ", password=" + Arrays.toString(password) + "]";
	}

}
