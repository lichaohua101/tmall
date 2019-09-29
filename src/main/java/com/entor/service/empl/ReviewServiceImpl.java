package com.entor.service.empl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.ReviewDao;
import com.entor.entity.Review;
import com.entor.service.ReviewService;

@Service("reviewService")
public class ReviewServiceImpl extends BaseServiceImpl<Review> implements ReviewService{

	@Resource
	private ReviewDao reviewDao;

	@Override
	public int getTotalsByPid(int pid) {
		return reviewDao.getTotalsByPid(pid);
	}

	@Override
	public List<Review> getReviewsByPid(int pid) {
		return reviewDao.getReviewsByPid(pid);
	}

	
	
}
