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
 * FileName:Category.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午5:51:11
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
public class Category {
	
	private Integer id;
	private String name;
	private Category superCate;
	private Set<Category> categories = new HashSet<Category>();
	private Set<Asset> assets = new HashSet<Asset>();
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
	 * @return the superCate
	 */
	public Category getSuperCate() {
		return superCate;
	}
	/**
	 * Author XuMaoSen
	 * @param superCate the superCate to set
	 */
	public void setSuperCate(Category superCate) {
		this.superCate = superCate;
	}
	/**
	 * Author XuMaoSen
	 * @return the categories
	 */
	public Set<Category> getCategories() {
		return categories;
	}
	/**
	 * Author XuMaoSen
	 * @param categories the categories to set
	 */
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	/**
	 * Author XuMaoSen
	 * @return the assets
	 */
	public Set<Asset> getAssets() {
		return assets;
	}
	/**
	 * Author XuMaoSen
	 * @param assets the assets to set
	 */
	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}

}
