package com.jspiders.designpattern.adapter;

public class TeacherAdapter extends Teacher implements Game {

	@Override
	public void football() {
		// TODO Auto-generated method stub
		setId(1);
		setName("Anil");
		setEmail("anil@gmail.com");
		
		System.out.println(getName()+" is a coach of football team.");
		
	}

	@Override
	public void hockey() {
		// TODO Auto-generated method stub
		setId(1);
		setName("Nikhil");
		setEmail("nikhil@gmail.com");
		
		System.out.println(getName()+" is a coach of hockey team.");
		
	}
	

}
