package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo2 {
	public static void main(String[] args) {
		
		File file=new File("Demo.txt");
		
		
			try {
				file.createNewFile();
				System.out.println("File is created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("File not created.");
			}
			
			
		}
	}


