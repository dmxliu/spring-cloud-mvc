package com.cloud.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cloud.model.User;

@Mapper
public interface UserMapper {

	@Select("SELECT * FROM user_info")
	List<User> findUserList();

	@Insert("INSERT INTO user_info(userName, age,sex) VALUES(#{user.userName}, #{user.age},#{user.sex})")
	void addUser(@Param("user")User user);

	@Select("SELECT * FROM user_info U WHERE U.ID = ID")
	User findUserInfo(@Param("id")Integer id);

	@Delete("DELETE FROM user_info WHERE ID = #{id}")
	void deleteUser(@Param("id")Integer id);
}
