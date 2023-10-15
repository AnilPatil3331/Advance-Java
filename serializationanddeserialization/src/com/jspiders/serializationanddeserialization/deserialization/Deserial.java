package com.jspiders.serializationanddeserialization.deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspiders.serializationanddeserialization.object.User;

public class Deserial {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("File.txt");
		if (file.exists()) {
			FileInputStream  fileInputStream=new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			User user =  (User) objectInputStream.readObject();
			System.out.println(user);
			System.out.println("object is read from the file");
			fileInputStream.close();
			objectInputStream.close();
		} else {
			System.out.println("File does not exist.");

		}
	}

}
