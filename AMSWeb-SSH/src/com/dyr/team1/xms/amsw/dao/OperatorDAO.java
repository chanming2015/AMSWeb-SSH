/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.team1.xms.amsw.dao;

import java.util.List;
import com.dyr.team1.xms.amsw.entity.Operator;

/**
 * Project:AssetManagementSystemWeb
 * Package:com.dyr.team1.xms.amsw.dao
 * FileName:OperatorDAO.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午6:09:10
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("unchecked")
public class OperatorDAO extends BaseDAO{

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-11 下午3:41:55
	 * Description
	 * @param name
	 * @param password
	 * @return
	 */
	public Operator selectOpByNameAndPass(String name, String password){
		Object obj = null;
		obj = getCurrentSession().createQuery("from Operator op where op.username=? and password=?")
											.setString(0, name).setString(1, password).uniqueResult();
		return obj==null?null:(Operator)obj;
	}
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-26 下午3:18:34
	 * Description
	 * @return
	 */
	public List<Operator> selectAllOp(){
		List<Operator> operators =null;
		operators = getCurrentSession().createQuery("from Operator").list();
		return operators.size()>0?operators:null;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-26 下午2:50:57
	 * Description
	 * @param newPass
	 * @param newPass2 
	 * @return
	 */
	public int updatePass(Integer id, String newPass){
		Operator op = (Operator) getCurrentSession().get(Operator.class, id);
		op.setPassword(newPass);
		return 1;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-26 下午5:50:39
	 * Description
	 * @param op
	 * @return
	 */
	public int insertOp(Operator op){
		getCurrentSession().save(op);
		return 1;
	}

}
