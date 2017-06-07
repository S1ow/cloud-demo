package org.cloud.demo.service.bo;

import java.util.List;

import org.cloud.demo.service.dao.UserDao;
import org.cloud.demo.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public int addUser(User user){
		return userDao.insert(user);
	}
	
	public User getUserById(int id){
		return userDao.selectByPrimaryKey(id);
	}
	
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
}
