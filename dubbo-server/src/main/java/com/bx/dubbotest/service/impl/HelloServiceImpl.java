package com.bx.dubbotest.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.bx.dubbotest.api.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	public String hello(String name) {
		System.out.println("HelloService接收到消息:"+name);
		System.out.println("这是Apollo测试分支");
		return "hello " + name;
	}
}
