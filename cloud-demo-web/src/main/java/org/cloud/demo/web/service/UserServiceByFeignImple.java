package org.cloud.demo.web.service;

import java.util.ArrayList;
import java.util.List;

import org.cloud.demo.web.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserServiceByFeignImple implements UserServiceByFeign{

	@Override
	public List<User> getAllUsers() {
		return new ArrayList<User>();
	}

}
