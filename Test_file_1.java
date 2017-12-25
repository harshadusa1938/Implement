package com.practical;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test_file_1 {

	
	public static void main(String[] args) throws IOException {
		
//		File file_a = new File("E:\\1");
		File file = new File("E:\\test.txt");
		
		File file_1 = new File("E:\\");
		
		File[] list = file_1.listFiles();
//
		for (int i = 0; i < list.length; i++) {
			File string = list[i];
			
			System.out.println(string);
			
		}
		
		
		
//		file_a.mkdir();
//		file.createNewFile();
//		System.out.println(file.canWrite()); 
//		System.out.println(file.isDirectory());
//		System.out.println(file.exists());
//		System.out.println(file.getAbsolutePath());
		
		
		
//		FileWriter fw = new FileWriter(file.getAbsoluteFile() , true);
//		BufferedWriter bw = new BufferedWriter(fw);
//
//		bw.write("wrewrew rwerewrewr ewr \n ewrewr ewr ");
//		
//		bw.close();
//		fw.close();
		
		
		
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader("E:\\test.rar");
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader("E:\\test.rar"));

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
		
	}
}
