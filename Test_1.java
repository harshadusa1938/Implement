package com.practical;

public class Test_1 {

	
	public static void main(String[] args) {
		
		
		String s = "abc";
		
		String s1 = "xyz";
		
		
		System.out.println(s.hashCode());
		
		System.out.println(s1.hashCode());
		
		System.out.println("-------------------------");
		
		s1 = s.substring(0, 1);
		
		//s = null;
		
		System.out.println(s.hashCode());
		
		System.out.println(s1.hashCode());
		
	}
	
	
	private void sum() {
		
	}
}
