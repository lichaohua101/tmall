package com.entor.service.empl;

import java.util.List;

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

	@Override
	public ProductImage queryMaxByPid(int pid) {
		return productImageDao.queryMaxByPid(pid);
	}

	@Override
	public List<ProductImage> fiveImages(int pid) {
		return productImageDao.fiveImages(pid);
	}

	@Override
	public List<ProductImage> queryAllByDetails(int id) {
		return productImageDao.queryAllByDetails(id);
	}

	@Override
	public ProductImage queryAllByPids(int pid) {
		return productImageDao.queryAllByPids(pid);
	}
	
	
}
