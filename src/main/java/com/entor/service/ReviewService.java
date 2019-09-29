package com.entor.service;

import java.util.List;

import com.entor.entity.Review;

public interface ReviewService extends BaseService<Review>{
	public int getTotalsByPid(int pid);
	public List<Review> getReviewsByPid(int pid);

}
