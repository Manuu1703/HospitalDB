package com.ty.Hospital_app.service;

import com.ty.Hospital_app.dto.Item;
import com.ty.Hospital_app.dto.User;
import com.ty.Hospital_app.imp.ItemDaoImp;
import com.ty.Hospital_app.imp.UserDaoImp;

public class UserService {
	public void saveUser(User user)
	{
		UserDaoImp daoImp = new UserDaoImp();
		User user1 = daoImp.saveUser(user);
		if(user1!=null)
		{
			System.out.println("data saved");

		}
		else
		{
			System.out.println("unfortunatly data not saved");
		}
	}
	public User getUserById(int uid)
	{
		UserDaoImp daoImp = new UserDaoImp();
		User user1 = daoImp.getUserbyId(uid);
		if(user1!=null)
		{
			return user1;

		}
		else
		{
			return null;
		}
	}
	public void deleteUserBYId(int uid)
	{
		UserDaoImp daoImp = new UserDaoImp();
		boolean flag = daoImp.deleteuser(uid);
		if(flag)
		{
			System.out.println("data deleted");;

		}
		else
		{
			System.out.println("Data saved");
		}
	}
	public User updateUserById(int uid,User user)
	{
		UserDaoImp daoImp = new UserDaoImp();
		User user1 = daoImp.updateUser(uid, user);
		if(user1!=null)
		{
			return user1;
		}
		else
		{
			return null;
		}

	}


}
