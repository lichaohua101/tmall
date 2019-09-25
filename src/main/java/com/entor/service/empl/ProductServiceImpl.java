package com.entor.service.empl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.ProductDao;
import com.entor.entity.Product;
import com.entor.service.ProductService;

@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService{
	
	@Resource
	private ProductDao productDao;

	@Override
	public List<Product> queryByCidPage(int cid,int currentPage, int pageSize) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("start", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		map.put("cid", cid);
		return productDao.queryByCidPage(map);
	}

	@Override
	public int getByCidTotals(int cid) {
		return productDao.getTotalsByCid(cid);
	}
}
