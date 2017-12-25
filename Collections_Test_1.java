package com.practical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Collections_Test_1 {

	public static void main(String[] args) {
		
		
		Map<String, String> m = new TreeMap(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		
		m.put("a", "value");
		m.put("a", "value1");

		m.put("a1", "value1");
		System.out.println(m);
		
		
		for (Entry<String, String> string : m.entrySet()) {
			System.out.println(string.getKey() +" -> " +string.getValue());
			
		}
		
		
		Map<Long, List<String>> map = new HashMap<>();
		List<String> l = new ArrayList<>();
		l.add("sdasdsa");
		l.addAll(l);
		map.put(909l, l);
		map.put(901l, l);
		
		
		System.out.println(map);
		
		
		Collections.sort(l, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
//				return 0;
			}
		} );
		
		
	}
}
