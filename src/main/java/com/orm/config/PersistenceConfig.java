package com.orm.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.orm.model.Employee;

@Configuration
@ComponentScan(basePackages="com.orm.dao")
public class PersistenceConfig {
	
	@Autowired
	private DataSource ds;
	
	@Bean(name = "sesbeanfactory")
	public LocalSessionFactoryBean createsessionFactoryBean( ) {
		System.out.println(ds.getClass());
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setDataSource(ds);
		bean.setAnnotatedClasses(Employee.class);
		Properties hbProps=new Properties();
		hbProps.put("hibernate.show_sql",true);
		hbProps.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		hbProps.put("hibernate.hbm2ddl.auto", "update");
		return bean;
	}
	@Bean(name="sesfact")
	public SessionFactory createSessionFactory(){
		return  createsessionFactoryBean().getObject();
	}

}
