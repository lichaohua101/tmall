package com.entor.service.empl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.ProductDao;
import com.entor.entity.Product;
import com.entor.service.ProductService;

@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService{
	
	@Resource
	private ProductDao productDao;
}
