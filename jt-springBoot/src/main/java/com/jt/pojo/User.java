package com.jt.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class User {
	private Integer id; //属性定义,必须使用包装类型
	private String name; //包装类型默认值为null .基本数据类型默认值为0
	
	//链式结构方法
	public User setId(Integer id) {
		this.id=id;
		return this;
		
	}
	
}
