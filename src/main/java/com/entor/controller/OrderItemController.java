package com.entor.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.entor.service.OrederItemService;

@Controller
public class OrderItemController {
	@Resource
	private OrederItemService orederItemService;
}
