package com.cts.educare.service;

import java.util.List;

import com.cts.educare.entity.User;

public interface UserService {
	List<User> getAll();
	User getById(Long id);
	User addUser(User user);
	User updateUser(User user);
	User deleteUser(Long id);
}
