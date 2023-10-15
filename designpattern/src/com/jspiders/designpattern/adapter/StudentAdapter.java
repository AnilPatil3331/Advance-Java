package com.jspiders.designpattern.adapter;

public class StudentAdapter extends Student implements Game {

	@Override
	public void football() {
		// TODO Auto-generated method stub
		setId(1);
		setName("Pratik");
		setEmail("pratik@gmail.com");
		
		System.out.println(getName()+" is a captain of football team.");
		
	}

	@Override
	public void hockey() {
		// TODO Auto-generated method stub
		setId(2);
		setName("Vaibhav");
		setEmail("vaibhav@gmail.com");
		System.out.println(getName()+" is a captain of hockey team.");
	}
	
	
}
