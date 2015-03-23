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
public class OperatorDAO {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-11 下午3:41:55
	 * Description
	 * @param name
	 * @param password
	 * @return
	 */
	public //@Select("select * from OperatorTable where operator_username=#{name} and operator_password=#{password} ")
	Operator selectOpByNameAndPass(String name, String password){
		return null;
	}
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-26 下午3:18:34
	 * Description
	 * @return
	 */
	public //@Select("select * from OperatorTable ")
	List<Operator> selectAllOp(){
		return null;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-26 下午2:50:57
	 * Description
	 * @param newPass
	 * @param newPass2 
	 * @return
	 */
	//@Update("update OperatorTable set operator_password=#{newPass} where operator_username=#{name} ")
	public int updatePass(String name, String newPass){
		return 0;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-26 下午5:50:39
	 * Description
	 * @param op
	 * @return
	 */
	//@Insert("insert into OperatorTable values(#{userName},#{password},#{used},#{role} )")
	public int insertOp(Operator op){
		return 0;
	}

}
