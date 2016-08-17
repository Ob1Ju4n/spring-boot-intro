package com.ob1ju4n;

import com.ob1ju4n.domain.Game;
import com.ob1ju4n.repository.GameRepository;
import com.ob1ju4n.service.DataLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate4.support.OpenSessionInViewFilter;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringDataAccessApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringDataAccessApplication.class);

	@Autowired
	DataLoader dataLoader;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataAccessApplication.class, args);
	}

}
