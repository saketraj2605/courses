package com.cts.educare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.educare.entity.User;
import com.cts.educare.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	List<User> getUsers(){
		return this.userService.getAll();
	}
	@GetMapping("/users/{userId}")
	User getUser(@PathVariable Long userId) {
		return this.userService.getById(userId);
	}
	@PutMapping("/users")
	User updateUser(@RequestBody User user)
	{
		return this.userService.updateUser(user);
	}
	@PostMapping("/users")
	User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	@DeleteMapping("/users/{userId}")
	User deleteUser(@PathVariable Long userId) {
		return this.userService.deleteUser(userId);
	}
	
}
