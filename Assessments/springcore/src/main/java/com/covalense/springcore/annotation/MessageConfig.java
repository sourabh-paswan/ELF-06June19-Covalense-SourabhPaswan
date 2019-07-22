package com.covalense.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.covalense.springcore.beans.MeassageBean;
import com.covalense.springcore.beans.MessageBean2;

@Configuration
public class MessageConfig {
	@Bean
	//@Scope("prototype")
	public MessageBean2 getMeassageBean() {
		MessageBean2 meassageBean = new MessageBean2();
		meassageBean.setMessage("hello worlds");
		return meassageBean;
	}

}
