package com.jspiders.taskdesignpattern.operations;

import java.util.Scanner;

public class CarMain {
	
	private static Car car;
	
	
	public static void main(String[] args) {
	
		try {
			factory().order();
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Car is not  orderd.");
		}
	}
		
		private  static Car factory() {
		
			
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter 1 to Purchase BMW Car\nEnter 2 to Purchase Swift Car\nEnter 3 to Purchase Thar Car\nEnter 4 to Purchase XUV Car\n");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			
		
		switch (choice) {
		case 1: 
			car = new BmwCar();
			break;
		case 2: 
			car = new SwiftCar();
			break;
		case 3: 
			car = new TharCar();
			break;
		case 4: 
			car = new XuvCar();
			break;
		
		
		default:
			System.out.println("Invalid Choice");
			
		}
			
		
		scanner.close();
		
	
			return car;
		}

}
