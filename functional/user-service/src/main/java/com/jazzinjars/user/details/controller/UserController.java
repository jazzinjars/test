package com.jazzinjars.user.details.controller;

import com.jazzinjars.user.details.model.User;
import com.jazzinjars.user.details.model.UserDetails;
import com.jazzinjars.user.details.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") long userId) {
	return userService.getUser(userId);
    }

    @PostMapping("/{userId}/details")
    public void saveUserDetails(@PathVariable("userId") long userId, @RequestBody UserDetails userDetails) {
	userService.saveDetails(userId, userDetails);
    }

    @GetMapping("/{userId}/details")
    public UserDetails getUserDetails(@PathVariable("userId") long userId) {
	return userService.getDetails(userId);
    }
}
