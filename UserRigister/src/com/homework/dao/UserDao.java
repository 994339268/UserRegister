package com.homework.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.homework.bean.User;
import com.webstore.dbutil.ConnUtil;





public class UserDao {

	public int useradd(User user) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(ConnUtil.getDs());
		
		String add = "insert into t_user values(null,?,?,?,?,?)";		
		
		int rows= qr.update(add,user.getUsername(),user.getNickname(),user.getPassword(),user.getEmail(),user.getBirthday());
		
		return rows;
	}
}
