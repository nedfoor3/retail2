package com.store.retail.springmvc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.store.retail.springmvc.DAO.BrandsDAO;
import com.store.retail.springmvc.Interface.RetailFacade;
import com.store.retail.springmvc.domain.Brand;
import com.store.retail.springmvc.domain.Message;

@RestController
public class HelloWorldRestController{

	public static final Logger logger = Logger.getLogger(HelloWorldRestController.class.getName());
	
	private RetailFacade retail;
	
	@RequestMapping(value = "/brands/", method= RequestMethod.GET)
	public List<Brand> helloWorld(){
		
		List<Brand> list = retail.getListAllBrands();
		
		return list;
		
	}
	
	@RequestMapping("/hello/{player}")
	public Message message(@PathVariable String player){
		Message msg = new Message(player, "Hello " + player);
		logger.info("msg: " + msg.toString());
		return msg;
	}

	/**
	 * @return the retail
	 */
	public RetailFacade getRetail() {
		return retail;
	}

	/**
	 * @param retail the retail to set
	 */
	public void setRetail(RetailFacade retail) {
		this.retail = retail;
	}


	
	
	
}
