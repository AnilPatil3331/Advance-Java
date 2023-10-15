package com.jspiders.multithreading.thread;

import java.util.Iterator;

public class MyThread8 extends Thread{
	@Override
	public void run() {
		String str="Anil Patil";
		char [] charArray= str.toCharArray();
		for (int i=0;i<charArray.length;i++)
		{
			System.out.println(charArray[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
