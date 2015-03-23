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
 * Project:AMSWeb-SSH
 * Package:com.dyr.team1.xms.amsw.entity
 * FileName:Role.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-3-19 下午9:17:03
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class Role {
	
	private Integer id;
	private String name;
	private Set<Operator> operators = new HashSet<Operator>();
	private Set<RoleMenu> roleMenus = new HashSet<RoleMenu>();
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Author XuMaoSen
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Author XuMaoSen
	 * @return the operators
	 */
	public Set<Operator> getOperators() {
		return operators;
	}
	/**
	 * Author XuMaoSen
	 * @param operators the operators to set
	 */
	public void setOperators(Set<Operator> operators) {
		this.operators = operators;
	}
	/**
	 * Author XuMaoSen
	 * @return the roleMenus
	 */
	public Set<RoleMenu> getRoleMenus() {
		return roleMenus;
	}
	/**
	 * Author XuMaoSen
	 * @param roleMenus the roleMenus to set
	 */
	public void setRoleMenus(Set<RoleMenu> roleMenus) {
		this.roleMenus = roleMenus;
	}

}
