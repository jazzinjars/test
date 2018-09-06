package com.jazzinjars.test.bdd.spring.web;

import com.jazzinjars.test.bdd.spring.User;
import com.jazzinjars.test.bdd.spring.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/{id}")
	public String show(@PathVariable Long id, Model model) {
		Optional<User> user = userRepository.findById(id);
		model.addAttribute("user", user.get());

		return "users/show";
	}

}
