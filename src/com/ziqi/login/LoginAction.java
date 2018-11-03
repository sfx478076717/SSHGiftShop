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
	 * Actionһ�����Ҫ�е�execute����
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
			// ��������Ϣд��Action���FieldErrors��
			// ��ʱStruts2 ����Զ����� INPUT ��ͼ
			this.addFieldError(username, "�û�������Ϊ��");
			System.out.println("�û���Ϊ�գ�");
		}
		if (this.password == null || this.password.length() < 3) {
			this.addFieldError(password, "���벻��Ϊ���Ҳ�������3λ");
			System.out.println("����Ϊ�ջ�����3λ��");
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

/*	private HttpServletRequest request;// ����request����

	public void setServletRequest(HttpServletRequest request) {
		// TODO �Զ����ɵķ������
		this.request = request;
	}*/
}
