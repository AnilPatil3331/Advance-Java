package com.jspiders.designpattern.adapter;

public class AdapterMain {
	
	public static void main(String[] args) {
		StudentAdapter studentAdapter =new StudentAdapter();
		studentAdapter.football();
		studentAdapter.hockey();
		
		TeacherAdapter teacherAdapter=new TeacherAdapter();
		teacherAdapter.football();
		teacherAdapter.hockey();
	}

}
