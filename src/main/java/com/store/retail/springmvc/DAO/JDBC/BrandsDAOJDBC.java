package com.store.retail.springmvc.DAO.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.store.retail.springmvc.DAO.BrandsDAO;
import com.store.retail.springmvc.controller.HelloWorldRestController;
import com.store.retail.springmvc.domain.Brand;

public class BrandsDAOJDBC extends JdbcTemplate implements BrandsDAO{

	public BrandsDAOJDBC(DataSource basicDataSource) {
        super(basicDataSource);
    }

	public static final Logger logger = Logger.getLogger(HelloWorldRestController.class.getName());
	
	public List<Brand> getListBrands() {
		logger.info("HOLA MUNDO DAOJDBC");
		
		List<Brand> brans = super.query("SELECT id as id, brand as description FROM DESARROLLO.RT_CATALOG_BRANDS", new BeanPropertyRowMapper(Brand.class));
		
		
		
		return brans;
	}

	
	public class CustomerRowMapper implements RowMapper
	{
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			Brand brand = new Brand();
			brand.setId("ID");
			brand.setDescription("BRAND");
			
			return brand;
		}
		
	}
}

