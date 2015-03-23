/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.team1.xms.amsw.entity;

import java.sql.Date;

/**
 * Project:AssetManagementSystemWeb
 * Package:com.dyr.team1.xms.amsw.entity
 * FileName:Back.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午6:04:19
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class Back {
	
	private Integer id;
	private Asset asset;
	private Date backTime;
	private String remark;
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
	 * @return the asset
	 */
	public Asset getAsset() {
		return asset;
	}
	/**
	 * Author XuMaoSen
	 * @param asset the asset to set
	 */
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	/**
	 * Author XuMaoSen
	 * @return the backTime
	 */
	public Date getBackTime() {
		return backTime;
	}
	/**
	 * Author XuMaoSen
	 * @param backTime the backTime to set
	 */
	public void setBackTime(Date backTime) {
		this.backTime = backTime;
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
	
}
