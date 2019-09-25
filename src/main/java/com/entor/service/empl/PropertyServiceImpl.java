package com.entor.service.empl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.entor.dao.PropertyDao;
import com.entor.entity.Property;
import com.entor.service.PropertyService;

@Controller("propertyService")
public class PropertyServiceImpl extends BaseServiceImpl<Property> implements PropertyService{

	@Resource
	private PropertyDao propertyDao;

	@Override
	public List<Property> queryByCidPage(int cid, int currentPage, int pageSize) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("cid", cid);
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		return propertyDao.queryByCidPage(map);
	}

	@Override
	public int getByCidTotals(int cid) {
		return propertyDao.getByCidTotals(cid);
	}
}
