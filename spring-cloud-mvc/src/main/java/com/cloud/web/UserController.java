package com.cloud.web;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.model.User;
import com.cloud.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	static Map<Integer, User> users = Collections
			.synchronizedMap(new HashMap<Integer, User>());

	@RequestMapping("userList")
	public List<User> getUserList() {
		return userService.findUserList();
	}

	@RequestMapping("addUser")
	public String addUser(User user) {
		userService.addUser(user);
		return "success";

	}

	
	@RequestMapping("getUser")
	public User getUser(Integer id ){
		return userService.findUserInfo(id);
	}
	
	@RequestMapping("delete/{id}") 
    public String deleteUser(@PathVariable Integer id) { 
		userService.deleteUser(id);
        return "success"; 
    } 

	
	
}
