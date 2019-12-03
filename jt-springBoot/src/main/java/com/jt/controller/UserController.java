package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:/properties/user.properties")
@ConfigurationProperties(prefix = "user")
public class UserController {
	//@Value("${user.id}")
	private Integer id;
	//@Value("${user.name}")
	private String name;
	//@Value("${user.age}")
	private Integer age;
	@RequestMapping("/user")
	public String user() {
		
		return id + ":" + age + ":" + name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
