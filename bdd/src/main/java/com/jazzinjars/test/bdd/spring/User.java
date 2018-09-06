package com.jazzinjars.test.bdd.spring;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
@Access(AccessType.PROPERTY)
public class User implements Serializable {

	private static final long serialVersionUID = 5015718308075223801L;

	@Access(AccessType.FIELD)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String username;
	private List<Message> messages;

	public User() {
	}

	public User(String username) {
		this.username = username;
	}

	public Long getId() {
		return id;
	}

	@Basic(optional = false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
}
