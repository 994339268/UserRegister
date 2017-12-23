package com.homework.service;

import java.sql.SQLException;

import com.homework.bean.User;
import com.homework.dao.UserDao;

public class UserService {

	UserDao userdao = new UserDao();
	public void adduser(User user) throws SQLException{
		
		userdao.useradd(user);
	}
}
