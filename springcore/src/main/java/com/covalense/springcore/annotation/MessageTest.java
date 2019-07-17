package com.covalense.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.MeassageBean;
import com.covalense.springcore.beans.MessageBean;

public class MessageTest {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageConfig.class);
		MeassageBean messageBean = applicationContext.getBean(MeassageBean.class);
		System.out.println(messageBean.getMessage());
	}

}
