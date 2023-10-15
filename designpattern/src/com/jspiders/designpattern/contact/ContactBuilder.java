package com.jspiders.designpattern.contact;

public class ContactBuilder {
	
	private String firstname;
	private String lastname;
	private String dob;
	private long mobileno;
	private long work;
	private long landline;
	private String website;
	private String email;
	private String address;
	private int home;

	public ContactBuilder firstname(String firstname) {
		this.firstname = firstname;
		return this;
	}
	public ContactBuilder lastname(String lastname) {
		this.lastname = lastname;
		return this;
	}
	public ContactBuilder dob(String dob) {
		this.dob = dob;
		return this;
	}
	public ContactBuilder mobileno(long mobileno) {
		this.mobileno = mobileno;
		return this;
	}
	public ContactBuilder work(long work) {
		this.work = work;
		return this;
	}
	public ContactBuilder landline(long landline) {
		this.landline = landline;
		return this;
	}
	public ContactBuilder website(String website) {
		this.website = website;
		return this;
	}
	public ContactBuilder email(String email) {
		this.email = email;
		return this;
	}
	public ContactBuilder address(String address) {
		this.address = address;
		return this;
	}
	public ContactBuilder home(int home) {
		this.home = home;
		return this;
	}
	public Contact bulidContact() {
		// TODO Auto-generated method stub
		return new Contact(firstname,lastname,dob,mobileno,work,landline,website,email,address,home);
	}
	
}
