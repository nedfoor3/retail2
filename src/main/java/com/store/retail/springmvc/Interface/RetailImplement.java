package com.store.retail.springmvc.Interface;

import java.util.List;

import com.store.retail.springmvc.DAO.BrandsDAO;
import com.store.retail.springmvc.domain.Brand;

public class RetailImplement implements RetailFacade{

	private BrandsDAO brandsDao;

	/**
	 * @return the brandsDao
	 */
	public BrandsDAO getBrandsDao() {
		return brandsDao;
	}

	/**
	 * @param brandsDao the brandsDao to set
	 */
	public void setBrandsDao(BrandsDAO brandsDao) {
		this.brandsDao = brandsDao;
	}

	public List<Brand> getListAllBrands() {
		
		return this.brandsDao.getListBrands();
	}
	
	
}
