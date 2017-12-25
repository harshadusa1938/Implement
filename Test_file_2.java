package com.practical;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test_file_2 {

	public static void main(String[] args) {
		
		/*Emp emp = new Emp();
		emp.setName("iiii");
		emp.setAddress("sadasd");
		
		
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;

		try {

			fout = new FileOutputStream("E:\\emp.ser");
			oos = new ObjectOutputStream(fout);
			oos.writeObject(emp);

			System.out.println("Done");

		} catch (Exception ex) {

			ex.printStackTrace();

		} finally {

			if (fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}*/
		
		FileInputStream fin = null;
		ObjectInputStream ois = null;

		try {

			fin = new FileInputStream("E:\\emp.ser");
			ois = new ObjectInputStream(fin);
			Emp emp = (Emp) ois.readObject();
			
			System.out.println(emp);

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {

			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		
	}
	
	
}
