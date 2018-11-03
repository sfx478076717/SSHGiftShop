package com.ziqi.login;

import com.opensymphony.xwork2.ActionSupport;
import com.ziqi.user.service.UserService;

/**
 * @author ZIQI
 * @date Apr 17, 2018
 */
public class LoginAction extends ActionSupport {
	private String username;
	private String password;

	private UserService userService;

	/**
	 * Action一般必须要有的execute方法
	 * @return
	 */
	public String execute() {
		if (userService.login(username, password) != null)
			return "index";
		else
			return "login";
	}

	public void validate() {
		if (this.username == null || this.username.equals("")) {
			// 将错误信息写到Action类的FieldErrors中
			// 此时Struts2 框架自动返回 INPUT 视图
			this.addFieldError(username, "用户名不能为空");
			System.out.println("用户名为空！");
		}
		if (this.password == null || this.password.length() < 3) {
			this.addFieldError(password, "密码不能为空且不能少于3位");
			System.out.println("密码为空或少于3位！");
		}
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

/*	private HttpServletRequest request;// 声明request对象

	public void setServletRequest(HttpServletRequest request) {
		// TODO 自动生成的方法存根
		this.request = request;
	}*/
}
