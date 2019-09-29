package com.entor.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entor.service.CategoryService;
import com.entor.service.OrederItemService;

public class Test4 {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	OrederItemService o = (OrederItemService) context.getBean("orederItemService");
	System.out.println(o.getSaleByPid(958));
}
}
