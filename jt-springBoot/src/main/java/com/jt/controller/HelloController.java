package com.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/** */
@RestController
//@ResponseBody
//@Controller
public class HelloController {
	@RequestMapping("/say")
	public String say() {
		return "Hello SpringBoot-----";
	}
}
