package com.cts.educare.DAO;

import java.util.List;

import com.cts.educare.entity.User;

public interface UserDao {
	List<User> getAllUsers();
	User getUserById(Long id);
	User addUser(User user);
	User updateUser(User user);
	User deleteUser(Long id);
	
}
