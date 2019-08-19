package com.cts.educare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cts.educare.DAO.UserDao;
import com.cts.educare.entity.User;
//@Component
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDAO;
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDAO.getAllUsers();
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return this.userDAO.getUserById(id);
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return this.userDAO.addUser(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return this.userDAO.updateUser(user);
	}

	@Override
	public User deleteUser(Long id) {
		// TODO Auto-generated method stub
		return this.userDAO.deleteUser(id);
	}
	

}
