package com.covalense.warehouse.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class ItemsConfig {
	@Bean
	public SessionFactory getSessionfactory() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		return factory;
	}

}
