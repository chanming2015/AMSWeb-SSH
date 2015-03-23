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
 * FileName:Employee.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午5:46:26
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class Employee {
	
	private Integer id;
	private String name;
	private String post;
	private String remark;
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
	 * @return the post
	 */
	public String getPost() {
		return post;
	}
	/**
	 * Author XuMaoSen
	 * @param post the post to set
	 */
	public void setPost(String post) {
		this.post = post;
	}
	/**
	 * Author XuMaoSen
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * Author XuMaoSen
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
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
