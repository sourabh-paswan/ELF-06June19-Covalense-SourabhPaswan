package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.CourceBean;
import com.covalense.springcore.beans.MessageBean;

import lombok.extern.java.Log;

@Log
public class CourceTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cource.xml");

		CourceBean courceBean = (CourceBean) applicationContext.getBean("courceBean");
		log.info("Id " + courceBean.getCourceid());
		log.info("cource " + courceBean.getCourceName());
		log.info("Faculty " + courceBean.getFaculty());
	}
}
