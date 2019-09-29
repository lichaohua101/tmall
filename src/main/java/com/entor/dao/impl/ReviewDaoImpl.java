package com.entor.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.entor.dao.ReviewDao;
import com.entor.entity.Review;
@Repository("reviewDao")
public class ReviewDaoImpl extends BaseDaoImpl<Review> implements ReviewDao{

	private final String namespace = "Review";
	
	@Resource
	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public int getTotalsByPid(int pid) {
		return getSqlSession().selectOne(namespace+".getTotalsByPid",pid);
	}

	@Override
	public List<Review> getReviewsByPid(int pid) {
		return getSqlSession().selectList(namespace+".getReviewsByPid",pid);
	}

}
