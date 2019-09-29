package com.entor.dao;

import java.util.List;

import com.entor.entity.Review;

public interface ReviewDao extends BaseDao<Review>{
	/**
	 * 获取商品的总评论数
	 * @param pid
	 * @return
	 */
	public int getTotalsByPid(int pid);
	/**
	 * 获取商品的全部品论
	 * @param pid
	 * @return
	 */
	public List<Review> getReviewsByPid(int pid);
	

}
