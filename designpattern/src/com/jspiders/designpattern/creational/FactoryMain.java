package com.jspiders.designpattern.creational;

import java.util.Scanner;

public class FactoryMain {
	
	private static Beverage beverage;
	
	public static void main(String[] args) {
	
		try {
			factory().order();
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Beverage is not  orderd.");
		}
	}
		
		private  static Beverage factory() {
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter 1 to order Masala Tea\nEnter 2 to order Ginger Tea\nEnter 3 to order LemonTea\nEnter 4 to order Green Tea\n");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			
		
		switch (choice) {
		case 1: 
			beverage = new MasalaTea();
			break;
		case 2: 
			beverage = new GingerTea();
			break;
		case 3: 
			beverage = new LemonTea();
			break;
		case 4: 
			beverage = new GreenTea();
			break;
			
		
		default:
			System.out.println("Invalid Choice");
			
		}
		scanner.close();
		return beverage;
	}

}
