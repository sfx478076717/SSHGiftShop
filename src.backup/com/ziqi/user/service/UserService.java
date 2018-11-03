package com.ziqi.user.service;

import java.util.List;

import com.ziqi.user.dao.UserDao;

import com.ziqi.user.pojos.User;

/**
 * @author ZIQI
 * @date 2018Äê4ÔÂ11ÈÕ
 */
public class UserService {
	private UserDao userDao;

	public User login(String name, String password) {
		return userDao.login(name, password);
	}

	/*public List<User> getAll() {
		return userDao.getAll();
	}*/
	

	/*public List<User> deleteById(int deleteId) {
		return userDao.deleteById(deleteId);
	}*/

	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
