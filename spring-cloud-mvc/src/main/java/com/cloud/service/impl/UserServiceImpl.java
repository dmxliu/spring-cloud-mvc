package com.cloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.mapper.UserMapper;
import com.cloud.model.User;
import com.cloud.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findUserList() {
		return userMapper.findUserList();
	}

	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	@Override
	public User findUserInfo(Integer id) {
		return userMapper.findUserInfo(id);
	}

	@Override
	public void deleteUser(Integer id) {
		userMapper.deleteUser(id);
	}

}
