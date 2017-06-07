package org.cloud.demo.service.controller;

import org.cloud.demo.service.bo.UserService;
import org.cloud.demo.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	@ResponseBody
	public int addUser(@RequestBody User user){
		return userService.addUser(user);
	}
	
	@RequestMapping(value="/getUserById",method=RequestMethod.GET)
	@ResponseBody
	public User getUserById(){
		return userService.getUserById(1);
	}
}
