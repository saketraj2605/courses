package com.cts.educare.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cts.educare.entity.User;

//@Component
@Repository
public class UserDAOImpl implements UserDao {
	private List<User> users;

	@PostConstruct
	void createUsers() {
		this.users = new ArrayList<User>();
		
		users.add(new User(1L,"First","Last","first@gmail.com","1234"));
		users.add(new User(2L,"Alok","Pratap","alok@gmail.com","121547"));
		users.add(new User(3L,"Sangeetrao","Sangeet","rao@gmail.com","sangeeet123"));
		users.add(new User(4L,"Harsh","Kaushik","harsh@gmail.com","user123"));
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return this.users;
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return this.users.get(id.intValue()-1);
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		this.users.add(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		this.users.set(user.getId().intValue()-1, user);
		return user;
	}

	@Override
	public User deleteUser(Long id) {
		// TODO Auto-generated method stub
		User user = this.users.get(id.intValue()-1);
		this.users.remove(user.getId().intValue()-1);
		return user;
	}
}
