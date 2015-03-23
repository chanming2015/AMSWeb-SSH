/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.team1.xms.amsw.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Project:AssetManagementSystemWeb
 * Package:com.dyr.team1.xms.amsw.entity
 * FileName:Asset.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午5:52:55
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class Asset {
	private Integer id;
	private String name;
	private Double price;
	private Date buyTime;
	private String statue;
	private String remark;
	private Category cate;
	private Set<Back> backs = new HashSet<Back>();
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
	 * @return the cate
	 */
	public Category getCate() {
		return cate;
	}
	/**
	 * Author XuMaoSen
	 * @param cate the cate to set
	 */
	public void setCate(Category cate) {
		this.cate = cate;
	}
	/**
	 * Author XuMaoSen
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * Author XuMaoSen
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * Author XuMaoSen
	 * @return the buyTime
	 */
	public Date getBuyTime() {
		return buyTime;
	}
	/**
	 * Author XuMaoSen
	 * @param buyTime the buyTime to set
	 */
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	/**
	 * Author XuMaoSen
	 * @return the statue
	 */
	public String getStatue() {
		return statue;
	}
	/**
	 * Author XuMaoSen
	 * @param statue the statue to set
	 */
	public void setStatue(String statue) {
		this.statue = statue;
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
	 * @return the backs
	 */
	public Set<Back> getBacks() {
		return backs;
	}
	/**
	 * Author XuMaoSen
	 * @param backs the backs to set
	 */
	public void setBacks(Set<Back> backs) {
		this.backs = backs;
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
