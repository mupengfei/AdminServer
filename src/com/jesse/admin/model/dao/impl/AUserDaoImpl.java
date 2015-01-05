package com.jesse.admin.model.dao.impl;

import org.hibernate.SessionFactory;

import com.jesse.admin.model.dao.AUserDao;
import com.jesse.admin.model.entity.AUser;

public class AUserDaoImpl implements AUserDao {
	private SessionFactory sessionFactory;

	@Override
	public AUser getAUser() {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().getTransaction().begin();
		
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
