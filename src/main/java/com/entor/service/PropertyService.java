package com.entor.service;

import java.util.List;
import java.util.Map;

import com.entor.entity.Product;
import com.entor.entity.Property;
import com.entor.service.empl.BaseServiceImpl;

public interface PropertyService extends BaseService<Property>{

	public List<Property> queryByCidPage(int cid,int currentPage, int pageSize);
	public int getByCidTotals(int cid);
	
}
