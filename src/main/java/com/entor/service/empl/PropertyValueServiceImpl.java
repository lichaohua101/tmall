package com.entor.service.empl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.entor.dao.PropertyValueDao;
import com.entor.entity.PropertyValue;
import com.entor.service.PropertyValueService;

@Controller("propertyValueService")
public class PropertyValueServiceImpl extends BaseServiceImpl<PropertyValue> implements PropertyValueService{

	@Resource
	private PropertyValueDao propertyValueDao;
}
