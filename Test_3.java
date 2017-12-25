package com.practical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test_3 {

	public static void main(String[] args) {
		
		boolean b = false ;
		int i = 0;
		
		System.out.println(b);
		System.out.println(i);
		
		Boolean boolean1 = null ;
		Integer integer = null;
		
		System.out.println(boolean1);
		System.out.println(integer);
		
		
		List<Boolean> arrayList = new ArrayList<>();
		List<Emp> linkedList = new LinkedList<>();
		
		Emp emp = new Emp();
		emp.setName("k");
		emp.setAddress("address");
		linkedList.add(emp);
		
		for (Emp emp1 : linkedList) {
			System.out.println(emp1);
			
		}
		
		for (int j = 0; j < linkedList.size(); j++) {
			Emp string = linkedList.get(j);
			
		}
		
		
		for (Iterator iterator = linkedList.iterator(); iterator.hasNext();) {
			Emp emp2 = (Emp) iterator.next();
			
		}
		
		
		List<Object> list;
		Map<Object, Object> map;
		Set<Object> set;
 		
	}
}
