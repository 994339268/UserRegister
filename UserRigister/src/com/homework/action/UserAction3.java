package com.homework.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.homework.bean.User;
import com.homework.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction3 extends ActionSupport implements ModelDriven<User> {

	UserService userservice = new UserService();
	User user =new User()  ;
	
	 

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}


	public String regist(){	

		   if (user!=null&&"zhaoliu".equals(user.getUsername())&&"8888".equals(user.getPassword())) {
			   return "REGISTER";
			}else {
				
				
				try {
					
					HttpServletRequest request = (HttpServletRequest) ServletActionContext.getRequest();
					HttpSession session = request.getSession(true);
					session.setAttribute("user",user);
					userservice.adduser(user);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return SUCCESS;
			}

		}
}
