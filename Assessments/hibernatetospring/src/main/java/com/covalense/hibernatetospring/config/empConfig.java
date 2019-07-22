package com.covalense.hibernatetospring.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

public class empConfig {
	@Bean
	public SessionFactory getSessionfactory() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		return factory;
	}

}
