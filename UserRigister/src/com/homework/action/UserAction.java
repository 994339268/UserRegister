package com.homework.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	
	String username ;
	String nickname;
	String password ;
	String email;
	String birthday;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String regist(){
		
 
		
	  /*HttpServletRequest request = ServletActionContext.getRequest();  	  
	  String username = request.getParameter("username");
	  String password = request.getParameter("password");
	  String verifyCode = request.getParameter("verifyCode");*/
	  
	   if ("zhaoliu".equals(username)&&"8888".equals(password)) {
		   return "REGISTER";
		}else {
		   return SUCCESS;
		}

	}
}
