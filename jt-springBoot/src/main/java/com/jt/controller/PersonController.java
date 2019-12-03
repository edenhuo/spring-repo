package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.User;

import lombok.Data;
@RestController
@PropertySource("classpath:/properties/person.properties") //指定配置文件导入

public class PersonController {
	@Value("${person.id}")
	private Integer id;
	@Value("${person.name}")
	private String name;
	
	
	@RequestMapping("/getPerson")
	public String getms() {
		
		return id+ ":"  + name;
	}
	
	public void user() {
		User user = new User();
		//链式结构
		user.setId(2).setName("eden");
	}
}
