package com.entor.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.entor.service.ProductImageService;

@Controller
public class ProductImageController {
	@Resource ProductImageService productImageService;
	
}
