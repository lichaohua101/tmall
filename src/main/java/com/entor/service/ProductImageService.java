package com.entor.service;

import com.entor.entity.ProductImage;
import com.entor.service.empl.BaseServiceImpl;

public interface ProductImageService extends BaseService<ProductImage>{
	public int getScondImage(int cid,int pid);
}
