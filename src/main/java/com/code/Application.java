package com.code;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.Servlet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@MapperScan(basePackages="com.code.dao")
public class Application extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private Environment env;
	
	@Bean
	public ServletRegistrationBean<Servlet> druidServletRegister(@Qualifier("statViewServlet") Servlet servlet){
		ServletRegistrationBean<Servlet> druidServlet = new ServletRegistrationBean<>();
		druidServlet.setServlet(servlet);
		druidServlet.setName("DruidStatViewServlet");
		ArrayList<String> urlMapping = new ArrayList<>(1);
		urlMapping.add("/druid/*");
		druidServlet.setUrlMappings(urlMapping);
		Map<String, String> initParams = new HashMap<>(2);
		initParams.put("loginUsername", "123");
		initParams.put("loginPassword", "123");
		druidServlet.setInitParameters(initParams);
		druidServlet.setEnabled(true);
		druidServlet.setLoadOnStartup(2);
		return druidServlet;
	}
	
	@Bean
	public FilterRegistrationBean<Filter> druidFilterRegister(@Qualifier("webStatFilter") Filter filter){
		FilterRegistrationBean<Filter> druidFilter = new FilterRegistrationBean<>();
		druidFilter.setFilter(filter);
		druidFilter.addUrlPatterns("/*");
		druidFilter.setName("DruidWebStatFilter");
		druidFilter.setOrder(2);
		Map<String, String> initParams = new HashMap<>(4);
		initParams.put("exclusions", "/public/*,*.js,*.css,/druid*,*.jsp,*.swf");
		initParams.put("principalSessionName", "sessionInfo");
		initParams.put("profileEnable", "true");
		druidFilter.setInitParameters(initParams);
		return druidFilter;
	}
	
	@Bean("statViewServlet")
	public Servlet statViewServlet(){
		return new StatViewServlet();
	}
	
	@Bean("webStatFilter")
	public Filter druidWebStatFilter(){
		return new WebStatFilter();
	}
	
	@Bean(destroyMethod="close")
	public DruidDataSource dataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		dataSource.setInitialSize(2);
		dataSource.setMaxActive(50);
		dataSource.setMinIdle(1);
		dataSource.setMaxWait(10000);
		dataSource.setValidationQuery("select 1 from dual");
		dataSource.setTestOnBorrow(false);
		dataSource.setTestWhileIdle(true);
		dataSource.setQueryTimeout(6);
		try {
			dataSource.setFilters("stat");
			dataSource.setFilters("wall");
		} catch (SQLException e) {
		}
		return dataSource;
	}

}

