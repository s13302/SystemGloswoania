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

}
