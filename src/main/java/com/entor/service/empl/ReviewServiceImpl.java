package com.entor.service.empl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.ReviewDao;
import com.entor.entity.Review;
import com.entor.service.ReviewService;

@Service("reviewService")
public class ReviewServiceImpl extends BaseServiceImpl<Review> implements ReviewService{

	@Resource
	private ReviewDao reviewDao;

	
	
}
