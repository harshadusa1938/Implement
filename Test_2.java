package com.practical;

public class Test_2 {

	public class Test_SP {

	}
	
	public static class Test_SP_1 {

	}
	
	
	public static void main(String[] args) {
		
		Test_2 test_2 = new Test_2();
		
		
		Test_SP test_SP = test_2.new Test_SP();
		
		Test_SP_1 test_SP_1 = new Test_SP_1();
		
		
		Ab_Test ab_Test = new Ab_Test() {
			
			@Override
			void sum(int a, int b) {
				// TODO Auto-generated method stub
				
			}
		};
		
		ab_Test.sum(0, 0);
		
		
		Ab_Test ab_impl = new Ab_impl();
		ab_impl.sum(0, 0);
	}
}


