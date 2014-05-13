package br.com.mvpdev.base.persistence;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource({ "classpath:persistence-mysql.properties" })
@ComponentScan({ "br.com.mvpdev.base" })
public class PersistenceConfig {

    @Autowired
    @Resource
    private Environment env;

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
	LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	sessionFactory.setDataSource(restDataSource());
	sessionFactory
		.setPackagesToScan(new String[] { "br.com.mvpdev.base.models" });
	sessionFactory.setHibernateProperties(hibernateProperties());
	return sessionFactory;
    }

    @Bean
    public DataSource restDataSource() {
	BasicDataSource dataSource = new BasicDataSource();
	dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
	dataSource.setUrl(env.getProperty("jdbc.url"));
	dataSource.setUsername(env.getProperty("jdbc.user"));
	dataSource.setPassword(env.getProperty("jdbc.pass"));
	return dataSource;
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
	HibernateTransactionManager txManager = new HibernateTransactionManager();
	txManager.setSessionFactory(sessionFactory().getObject());
	return txManager;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
	return new PersistenceExceptionTranslationPostProcessor();
    }

    @SuppressWarnings("serial")
    Properties hibernateProperties() {
	return new Properties() {
	    {
		setProperty("hibernate.hbm2ddl.auto",
			env.getProperty("hibernate.hbm2ddl.auto"));
		setProperty("hibernate.dialect",
			env.getProperty("hibernate.dialect"));
		setProperty("hibernate.globally_quoted_identifiers", "true");
		setProperty("hibernate.show_sql",
			env.getProperty("hibernate.show_sql"));
	    }
	};
    }
}
