package com.entor.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.entor.service.OrderService;

@Controller
public class OrderController {
	@Resource
	private OrderService orderService;
}
