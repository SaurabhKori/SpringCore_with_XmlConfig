package com.jsp.spring_jdbcwithannotation_config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
/**
 * @author Saurabh
 */

import com.jsp.spring_jdbcwithannotation_config.dao.StudentDao;

@Configuration
public class JdbcConfig {
	// DataSource is  a interface which is present javax.sql package,this is get the connection with the help of DriverManagerDataSource
	@Bean("getdata")
	public DataSource getDataSource() {

		DriverManagerDataSource driver =new DriverManagerDataSource();
		driver.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driver.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		driver.setUsername("root");
		driver.setPassword("root");
		return driver;
	}
	@Bean("gettem")
	public JdbcTemplate gettemplet() {
		JdbcTemplate tem=new JdbcTemplate();
		tem.setDataSource(getDataSource());
		return tem;
	}
	@Bean("stdao")
	public StudentDao getstudentDao() {
		StudentDao dao=new StudentDao();
		dao.setTem(gettemplet());
		return dao;
	}

}
