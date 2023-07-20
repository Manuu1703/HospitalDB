package com.ty.Hospital_app.dao;

import java.util.List;

import com.ty.Hospital_app.dto.User;

public interface UserDao {

	public User saveUser(User user);
	
	public User getUserbyId(int uid);
	
	public boolean deleteuser(int uid);
	
	public User updateUser(int uid,User user);
	
	public List<User> getAllUser();
	
	public List<User> getUserByRole(String role);
}
