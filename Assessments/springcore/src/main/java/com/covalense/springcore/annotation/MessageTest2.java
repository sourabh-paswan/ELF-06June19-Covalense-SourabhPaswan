package com.covalense.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.MessageBean2;

public class MessageTest2 {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean2 messageBean = applicationContext.getBean(MessageBean2.class);

		MessageBean2 messageBean2 = applicationContext.getBean(MessageBean2.class);

		System.out.println(messageBean.getMessage());

		System.out.println(messageBean2.getMessage());

		messageBean2.setMessage("changed now");

		System.out.println(messageBean.getMessage());

		System.out.println(messageBean2.getMessage());
		((ConfigurableApplicationContext) applicationContext).close();
	}

}
