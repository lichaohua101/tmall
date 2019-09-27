package com.entor.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	public static <T> void main(String[] args) {
		
		
		String string[] = {"1","2","3"};
		int a [] = {5,6,7,87};
		Object [] o = {a,string};
		
		for (int i = 0; i < o.length; i++) {
			
		}
		/*List<Object> list = new ArrayList<>();
		list.add(string);
		list.add(a);
		System.err.println(list);*/
	/*	for (Object o : list) {
			//System.out.println(Arrays.toString(o));
		}*/
		/*for (String i : string) {
			
			 list.add(string[Integer.parseInt(i)]); 
		}*/
		
		/*List<Object> list1 = new ArrayList<Object>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		List<Object> list2 = new ArrayList<>();
		list2.add("6");
		list2.add("7");
		list2.add("8");
		list2.add("9");
		
		List<Object> list3 = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			list3.add(list1.get(i)+list2.get(i)); 
		}*/
	}
}
