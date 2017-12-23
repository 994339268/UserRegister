package com.homework.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.homework.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction2 extends ActionSupport {

	
	User user ;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}




	public String regist(){	

	   if (user!=null&&"zhaoliu".equals(user.getUsername())&&"8888".equals(user.getPassword())) {
		   return "REGISTER";
		}else {
			return SUCCESS;
		}

	}
}
