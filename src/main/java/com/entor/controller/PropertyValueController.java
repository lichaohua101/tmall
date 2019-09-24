package com.entor.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.entor.service.PropertyValueService;

@Component
public class PropertyValueController {
	@Resource
	private PropertyValueService propertyValueService;
}
