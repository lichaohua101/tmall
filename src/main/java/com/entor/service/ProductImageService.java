package com.entor.service;

import java.util.List;

import com.entor.entity.ProductImage;
import com.entor.service.empl.BaseServiceImpl;

public interface ProductImageService extends BaseService<ProductImage>{
	public int getScondImage(int cid,int pid);
	public ProductImage queryMaxByPid(int pid);
	public List<ProductImage> fiveImages(int pid);
	public List<ProductImage> queryAllByDetails(int id);
	public ProductImage queryAllByPids(int pid);
}
