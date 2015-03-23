/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.team1.xms.amsw.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Project:AssetManagementSystemWeb
 * Package:com.dyr.team1.xms.amsw.entity
 * FileName:Operator.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午5:43:38
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class Operator {
	
	private Integer id;
	private String userName;
	private String password;
	private String used;
	private Role role;
	private Set<Lend> lends = new HashSet<Lend>();
	/**
	 * Author XuMaoSen
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * Author XuMaoSen
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * Author XuMaoSen
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * Author XuMaoSen
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * Author XuMaoSen
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Author XuMaoSen
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Author XuMaoSen
	 * @return the used
	 */
	public String getUsed() {
		return used;
	}
	/**
	 * Author XuMaoSen
	 * @param used the used to set
	 */
	public void setUsed(String used) {
		this.used = used;
	}
	/**
	 * Author XuMaoSen
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}
	/**
	 * Author XuMaoSen
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}
	/**
	 * Author XuMaoSen
	 * @return the lends
	 */
	public Set<Lend> getLends() {
		return lends;
	}
	/**
	 * Author XuMaoSen
	 * @param lends the lends to set
	 */
	public void setLends(Set<Lend> lends) {
		this.lends = lends;
	}
	
}
