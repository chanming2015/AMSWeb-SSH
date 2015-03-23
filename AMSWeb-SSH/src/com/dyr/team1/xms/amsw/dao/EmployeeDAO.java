/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.team1.xms.amsw.dao;

import java.util.List;
import com.dyr.team1.xms.amsw.entity.Employee;

/**
 * Project:AssetManagementSystemWeb
 * Package:com.dyr.team1.xms.amsw.dao
 * FileName:EmployeeDAO.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午6:08:32
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("unchecked")
public class EmployeeDAO extends BaseDAO{

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-25 下午9:21:08
	 * Description
	 * @return
	 */
	public List<Employee> selectAllEmp(){
		List<Employee> employees = getCurrentSession().createQuery("from Employee").list();
		return employees.size()>0?employees:null;
	}
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-25 下午10:16:05
	 * Description
	 * @param id
	 * @return
	 */
	public Employee selectEmpBy(Integer id){
		Employee emp = (Employee) getCurrentSession().get(Employee.class, id);
		return emp==null?null:emp;
	}
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-25 下午9:02:31
	 * Description
	 * @return
	 */
	public int selectMaxEmpNo(){
		Object obj = getCurrentSession().createQuery("select max(e,id) from Employee e").uniqueResult();
		return (Integer) obj;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-25 下午9:15:55
	 * Description
	 * @param e
	 * @return
	 */
	public int insertEmp(Employee e){
		getCurrentSession().save(e);
		return 1;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-25 下午9:38:16
	 * Description
	 * @param id
	 * @return
	 */
	public int deleteEmp(Integer id){
		Employee emp = (Employee) getCurrentSession().get(Employee.class, id);
		getCurrentSession().delete(emp);
		return 1;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-25 下午10:20:50
	 * Description
	 * @param e
	 * @return
	 */
	public int updateEmp(Employee e){
		Employee emp = (Employee) getCurrentSession().get(Employee.class, e.getId());
		emp.setName(e.getName());
		emp.setPost(e.getPost());
		emp.setRemark(e.getRemark());
		return 1;
	}

}
