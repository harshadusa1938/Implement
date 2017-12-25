package com.practical;

import java.io.File;
import java.io.IOException;

public class Test_file_3 {
	public static void main(String[] args) {

		try{

	    	   //create a temp file
//	    	   File temp = File.createTempFile("temp file-name", ".tmp");
//	    	   
//
//	    	   System.out.println("Temp file : " + temp.getAbsolutePath());
//	    	   System.out.println(temp.getPath());
//	    	   	System.out.println(temp.getParent());
//	    	   	System.out.println(temp.getName());
			
			File file = new File("E:\\test_123");
			
		//	boolean mkdirs = file.mkdirs();
			//boolean mkdir = file.mkdir();
			//System.out.println(mkdirs);
			
			boolean directory = file.isDirectory();
			boolean file2 = file.isFile();
			file.list();
			
			//file.deleteOnExit();
			
	    	}catch(Exception e){

	    	   e.printStackTrace();

	    	}

	}
}
