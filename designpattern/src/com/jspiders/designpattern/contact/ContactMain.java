package com.jspiders.designpattern.contact;

public class ContactMain {
	
	public static void main(String[] args) {
		
		Contact contact= new ContactBuilder().mobileno(8796489335l).firstname("Anil").lastname("patil").bulidContact();
		System.out.println(contact);
	}

}
