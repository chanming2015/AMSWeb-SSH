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
 * FileName:Menu.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午5:36:59
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class Menu {
	
	private Integer id;
	private String name;
	private String url;
	private Menu superMenu;
	private Set<Menu> menus = new HashSet<Menu>();
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * Author XuMaoSen
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * Author XuMaoSen
	 * @return the superMenu
	 */
	public Menu getSuperMenu() {
		return superMenu;
	}
	/**
	 * Author XuMaoSen
	 * @param superMenu the superMenu to set
	 */
	public void setSuperMenu(Menu superMenu) {
		this.superMenu = superMenu;
	}
	/**
	 * Author XuMaoSen
	 * @return the menus
	 */
	public Set<Menu> getMenus() {
		return menus;
	}
	/**
	 * Author XuMaoSen
	 * @param menus the menus to set
	 */
	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
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
