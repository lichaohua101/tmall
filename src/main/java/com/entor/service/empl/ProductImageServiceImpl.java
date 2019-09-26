package com.entor.service.empl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.entor.dao.ProductImageDao;
import com.entor.entity.ProductImage;
import com.entor.service.ProductImageService;

@Controller("productImageService")
public class ProductImageServiceImpl extends BaseServiceImpl<ProductImage> implements ProductImageService{

	@Resource
	private ProductImageDao productImageDao;

	@Override
	public int getScondImage(int cid, int pid) {
		return productImageDao.getScondImage(cid, pid);
	}
	
	
}
