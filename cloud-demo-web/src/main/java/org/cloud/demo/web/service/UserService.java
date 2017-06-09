package org.cloud.demo.web.service;

import java.util.ArrayList;
import java.util.List;

import org.cloud.demo.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

//Ribbon实现方式
@Service
public class UserService {

	@Autowired
	RestTemplate restTemplate;
	
	@Value("${service.name:cloudservice}")
	String SERVICE_NAME;
	 
	@SuppressWarnings("unchecked")
	@HystrixCommand(fallbackMethod = "fallbackSearchAll")
	public List<User> readUserInfo() {
	     return restTemplate.getForObject("http://"+ SERVICE_NAME +"/user/getAllUsers", List.class);
	}
	
	@SuppressWarnings("unused")
	private List<User> fallbackSearchAll() {
		 System.out.println("HystrixCommand fallbackMethod handle!");
		 List<User> ls = new ArrayList<User>();
		 User user = new User();
		 user.setName("ivan");
		 ls.add(user);
		 return ls;
	}
}
