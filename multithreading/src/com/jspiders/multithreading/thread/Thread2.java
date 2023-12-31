package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.Source;

public class Thread2 extends Thread {

	private Source source;
	
	public Thread2(Source source) {
		super();
		this.source =source;
		
		
	}
	
	@Override
	public void run() {
		
		synchronized (source.resource2) {
			System.out.println("Lock is applied on resource2 by " + this.getName());
		
		synchronized (source.resource1) {
			System.out.println("Lock is applied on resource1 by " + this.getName());
		}
	}
	}
}
