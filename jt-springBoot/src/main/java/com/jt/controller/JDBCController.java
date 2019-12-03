package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "jdbc")
public class JDBCController {
	
	//@Value("${jdbc.username}")  //从spring容器中利用spel动态获取数据
	private String username;
	//@Value("${jdbc.password}")
	private String password;
		
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@RequestMapping("/getMsg")
	public String hello() {
		
		return username + ":" + password; 
	}
}
