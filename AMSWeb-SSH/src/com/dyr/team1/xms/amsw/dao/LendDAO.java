/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.team1.xms.amsw.dao;

/**
 * Project:AssetManagementSystemWeb
 * Package:com.dyr.team1.xms.amsw.dao
 * FileName:LendDAO.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午6:08:41
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class LendDAO extends BaseDAO{

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-26 下午9:06:40
	 * Description
	 * @param assetId
	 * @param empId
	 * @param remark
	 * @param name 
	 * @return
	 */
	//@Insert("insert into LendTable values(#{assetId},#{empId},default,#{name},#{remark}) ")
	public int insertLendInfo(int assetId, int empId, String remark, String name){
		return 0;
	}

}
