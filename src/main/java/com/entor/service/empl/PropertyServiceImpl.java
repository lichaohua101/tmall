package com.entor.service.empl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.entor.dao.PropertyDao;
import com.entor.entity.Property;
import com.entor.service.PropertyService;

@Controller("propertyService")
public class PropertyServiceImpl extends BaseServiceImpl<Property> implements PropertyService{

	@Resource
	private PropertyDao propertyDao;
}
