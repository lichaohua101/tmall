package com.entor.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.entor.dao.ReviewDao;

@Controller
public class ReviewController {
	@Resource
	private ReviewDao reviewDao;
}
