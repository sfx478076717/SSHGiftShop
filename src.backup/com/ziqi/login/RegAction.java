package com.ziqi.login;

import com.ziqi.user.service.UserService;

import com.ziqi.user.pojos.User;

/**
 * @author ZIQI
 * @date 2018Äê4ÔÂ17ÈÕ
 */
public class RegAction {
	private User user;
	private UserService userService;
	
	public String execute() {
		userService.saveUser(user);
		return "regSuccess";
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
