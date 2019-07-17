package com.covalense.assessment.two.conditions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.covalense.assessment.dto.ProductsBean;

import lombok.extern.java.Log;

//Objective: Get a list of Products, which has a price less than 100.


@Log
public class ConditionOne {
public static void main(String[] args) {
	Configuration configuration = new Configuration();
	configuration.configure();
	
	SessionFactory factory = configuration.buildSessionFactory();
	Session session = factory.openSession();
	
	String hql = "select from ProdutsBean where price=100";
	Query query = session.createQuery(hql);
	int result = query.executeUpdate();
	log.info(""+result);
	
	ProductsBean bean = new ProductsBean();
	
	log.info("Id "+bean.getProductID());
	log.info("name "+bean.getProductName());
	log.info("Price "+bean.getPrice());
	log.info("name "+bean.getColour());
	log.info("name "+bean.getWeight());
	session.close();
}
}
