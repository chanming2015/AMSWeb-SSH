/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.team1.xms.amsw.dao;

import com.dyr.team1.xms.amsw.entity.Asset;
import com.dyr.team1.xms.amsw.entity.Employee;
import com.dyr.team1.xms.amsw.entity.Lend;
import com.dyr.team1.xms.amsw.entity.Operator;

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
	 * @param op 
	 * @return
	 */
	public int insertLendInfo(Integer assetId, Integer empId, String remark, Operator op){
		Asset asset = (Asset) getCurrentSession().get(Asset.class, assetId);
		Employee employee = (Employee) getCurrentSession().get(Employee.class, empId);
		Lend lend = new Lend();
		lend.setAsset(asset);
		asset.getLends().add(lend);
		lend.setEmp(employee);
		employee.getLends().add(lend);
		lend.setOp(op);
		op.getLends().add(lend);
		getCurrentSession().save(lend);
		return 1;
	}

}
