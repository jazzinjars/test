package com.jazzinjars.test.bdd.spring;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "messages")
@Access(AccessType.PROPERTY)
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Access(AccessType.FIELD)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private User author;

	private String content;

	public Message() {
	}

	public Message(User author, String content) {
		this.author = author;
		this.content = content;
	}

	@ManyToOne(optional = false)
	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	@Basic(optional = false)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
