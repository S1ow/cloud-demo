package org.cloud.demo.web.service;

import java.util.List;

import org.cloud.demo.web.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//绑定該接口到{服务名称，通过config管理}服务，并通知Feign组件对该接口进行代理（不需要编写接口实现）
@FeignClient(value="cloudservice",fallback=UserServiceByFeignImple.class)
public interface UserServiceByFeign {
	
	@RequestMapping(value="/user/getAllUsers",method=RequestMethod.GET)
	List<User> getAllUsers();
}
