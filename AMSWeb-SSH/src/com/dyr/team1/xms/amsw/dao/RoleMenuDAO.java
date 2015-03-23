/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.team1.xms.amsw.dao;

import java.util.List;
import com.dyr.team1.xms.amsw.entity.RoleMenu;

/**
 * Project:AssetManagementSystemWeb
 * Package:com.dyr.team1.xms.amsw.dao
 * FileName:RoleMenuDAO.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午6:09:42
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class RoleMenuDAO extends BaseDAO{

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-12 下午6:30:12
	 * Description
	 * @param id
	 * @return
	 */
	public //@Select("select * from RoleMenuTable where roleMenu_role=#{name} ")
	List<RoleMenu> selectRoleMenuListByRoleId(Integer id){
		return null;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-26 下午5:42:22
	 * Description
	 * @return
	 */
	//@Select("select *from RoleTable")
	public List<String> selectAllRole(){
		return null;
	}

}
