package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo1 {
	public static void main(String[] args) {
		File file = new File("D:\\WEJA3/Test.txt");
		if(file.exists()) {
			System.out.println("file already exist");
			
		}else {
			try {
				file.createNewFile();
				System.out.println("File is created");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("File is not created");
			}
		}
	}
}