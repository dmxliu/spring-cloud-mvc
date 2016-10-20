package com.cloud.service;

import java.util.List;

import com.cloud.model.User;

public interface UserService {

	List<User> findUserList();

	void addUser(User user);

	User findUserInfo(Integer id);

	void deleteUser(Integer id);


}
