/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.team1.xms.amsw.dao;

import java.util.List;
import com.dyr.team1.xms.amsw.entity.Asset;

/**
 * Project:AssetManagementSystemWeb
 * Package:com.dyr.team1.xms.amsw.dao
 * FileName:AssetDAO.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-2-10 下午6:07:50
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:
 * Version:
 */
@SuppressWarnings("unchecked")
public class AssetDAO extends BaseDAO{

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-24 下午5:02:20
	 * Description
	 * @param name
	 * @return
	 */
	public List<Asset> selectAssetsByCateId(int id){
		return getCurrentSession().createQuery("select * from Asset a where a.cate.id=?").setParameter(0, id).list();
	}
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-25 下午3:03:05
	 * Description
	 * @return
	 */
	public List<Asset> selectAllAsset(){
		return getCurrentSession().createQuery("select * from Asset ").list();
	}
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-25 下午6:58:25
	 * Description
	 * @param id
	 * @return
	 */
	public Asset selectAssetsById(int id){
		Object obj = getCurrentSession().createQuery("select * from Asset a where a.id=?").setParameter(0,id).uniqueResult();
		return obj == null ? null : (Asset)obj;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-24 下午9:08:23
	 * Description 得到最大资产编号
	 * @return
	 */
	public int selectMaxAssetNo(){
		return (Integer) getCurrentSession().createQuery("select max(a.id) from Asset a").uniqueResult();
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-24 下午9:47:55
	 * Description
	 * @param id
	 * @param name
	 * @param cate
	 * @param price
	 * @return
	 */
	public int insertAsset(int id, String name, String cate, double price){
		
		Asset asset = new Asset();
		getCurrentSession().save(asset);
		return 1;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-25 下午6:49:44
	 * Description
	 * @param id
	 * @return
	 */
	//@Delete("delete from AssetTable where asset_id=#{id} ")
	public int deleteAsset(int id){
		Asset asset = (Asset) getCurrentSession().get(Asset.class, id);
		getCurrentSession().delete(asset);
		return 1;
		
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-25 下午7:50:56
	 * Description
	 * @param id
	 * @param name
	 * @param cateName
	 * @param price
	 * @param statue
	 * @param remark
	 * @return
	 */
	//@Update("update AssetTable set asset_name=#{name},asset_cate=#{cateName},asset_price=#{price},asset_statue=#{statue},asset_remark=#{remark} where asset_id=#{id} ")
	public int updateAsset(int id, String name, String cateName, double price, String statue, String remark){
		return 1;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-2-26 下午9:15:14
	 * Description
	 * @param assetId 
	 * @param string
	 * @return
	 */
	public int updateAssetStatue(Integer id, String statue){
		Asset asset = (Asset) getCurrentSession().get(Asset.class, id);
		asset.setStatue(statue);
		return 1;
	}

}
