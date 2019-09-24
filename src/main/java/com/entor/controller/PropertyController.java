package com.entor.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.entor.service.PropertyService;

@Controller
public class PropertyController {
	@Resource
	private PropertyService propertyService;
}
