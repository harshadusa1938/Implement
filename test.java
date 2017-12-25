package com.practical;

import org.apache.commons.lang3.SystemUtils;

public class test {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("ABC");
		
		System.out.println(buffer);
		System.out.println(buffer.hashCode());
		buffer.append("xyz");
		buffer.append("xyz");
		buffer.reverse();
		
		System.out.println(buffer);
		System.out.println(buffer.hashCode());
		
		System.out.println(SystemUtils.IS_JAVA_1_7);		
	}
}
