/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.team1.xms.amsw.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Project:AMSWeb-SSH
 * Package:com.dyr.team1.xms.amsw.dao
 * FileName:BaseDAO.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-22 下午8:18:54
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public abstract class BaseDAO {
	
	private SessionFactory sessionFactory;
	
	/**
	 * Author XuMaoSen
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Author XuMaoSen
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}

}
