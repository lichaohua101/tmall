package com.entor.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.entor.entity.Product;
import com.entor.service.ProductService;

public class Test1 {
	@Resource
	private static ProductService productService;
	public static void main(String[] args) {
		/**
		 * 最常见也是大多数情况下用的最多的，一般在键值对都需要使用
		 */
		/*Map<String, Object> map = new HashMap<String, Object>();
		map.put("熊大", "棕色");
		map.put("熊二", "黄色");
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			String mapKey = entry.getKey();
			Object mapValue = entry.getValue();
			System.out.println(mapKey + ":" + mapValue);
		}
*/
		Map <String,String>map = new HashMap<String,String>();
		map.put("熊1", "棕色");
		map.put("熊2", "棕色");
		map.put("熊3", "棕色");
		map.put("熊二", "黄色");
		/*//key
		for(String key : map.keySet()){
		    System.out.println(key);
		}*/
		//value
		for(String value : map.values()){
		    System.out.println(value);
		}
	}
}
