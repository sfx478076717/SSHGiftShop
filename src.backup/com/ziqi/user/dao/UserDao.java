package com.ziqi.user.dao;

import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.ziqi.user.pojos.User;

/**
 * @author ZIQI
 * @date 2018��4��11��
 */
public class UserDao extends HibernateDaoSupport {
	
	public User login(final String username, final String password) {
		final String hql = "from User where user_name=? and password=? ";
		List<User> users = (List<User>) getHibernateTemplate().find(hql, username, password);

		if (users == null || users.isEmpty())
			return null;
		return users.get(0);
	}

	/*public List<User> getAll() {
		//
		String hql = "from User";
		return (List<User>) getHibernateTemplate().find(hql);
	}*/

	/*public List<User> deleteById(final int deleteId) {
		 ����IDɾ���û������ 
		User user1 = (User) getHibernateTemplate().load(User.class, deleteId);
		getHibernateTemplate().delete(user1);

		String hql = "from User";
		return (List<User>) getHibernateTemplate().find(hql);
	}*/

	public void saveUser(User user) {
		/*
		 * Session session = getSessionFactory().getCurrentSession();
		 * session.save(user);
		 */
		getHibernateTemplate().save(user);
	}

}
