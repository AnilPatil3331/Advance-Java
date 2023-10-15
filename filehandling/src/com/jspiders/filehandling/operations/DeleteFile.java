package com.jspiders.filehandling.operations;

import java.io.File;

public class DeleteFile {
	
	public static void main(String[] args) {
		
		File file =new File("D:\\WEJA3/Test.txt");
		
		if (file.exists()) {
			file.delete();
			System.out.println("File Deleted successfully.");
		}
		else {
			System.out.println("File Does not exist.");
		}
	}

}
