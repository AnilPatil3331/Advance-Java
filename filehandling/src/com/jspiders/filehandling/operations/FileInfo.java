package com.jspiders.filehandling.operations;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		
		File file=new File("Demo.txt");
		 if (file.exists()) {
			
			System.out.println("Name : " + file.getName());
			System.out.println("Path : " + file.getAbsolutePath());
			
			if (file.canRead()) {
				
				System.out.println("File is readble.");
			}
			else {
				System.out.println("File not readble.");
			}
			
			
			if (file.canWrite()) {
				
				System.out.println("File is writeable");
			}
			else {
				System.out.println("File is not writeable");
			}
			
			if (file.canExecute()) {
				System.out.println("File is Exicutable");
			} else {
				System.out.println("File is not Excitable");

			}
			
			System.out.println(file.length());
			
		}
	}
}
