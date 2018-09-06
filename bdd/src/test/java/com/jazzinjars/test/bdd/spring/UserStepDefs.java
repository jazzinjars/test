package com.jazzinjars.test.bdd.spring;

import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class UserStepDefs {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private MessageRepository messageRepository;

	private User user;

	public void thereIsAuser() {
		user = new User();
		user.setUsername("Arya");
		userRepository.save(user);
	}

	@Given("a User has posted the following messages:")
	public void a_User_has_posted_the_following_messages(List<Message> messages) throws Throwable {
		thereIsAuser();
		for (Message m : messages) {
			m.setAuthor(user);
			messageRepository.save(m);
		}
		assertTrue("No transaction is active", TransactionSynchronizationManager.isActualTransactionActive());
	}
}
