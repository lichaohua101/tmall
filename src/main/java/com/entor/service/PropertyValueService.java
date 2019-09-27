package com.entor.service;

import java.util.List;

import com.entor.entity.PropertyValue;
import com.entor.entity.PropertyValueVO;

public interface PropertyValueService extends BaseService<PropertyValue>{
	public List<PropertyValueVO> queryAllByPid(int pid);
	
	public void updateValueById(String value,String ptid);
}
