package com.jspiders.designpattern.contact;

public class Contact {
	
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
	public Contact(String firstname, String lastname, String dob, long mobileno2, long work, long landline,
			String website, String email, String address, int home) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.mobileno = mobileno2;
		this.work = work;
		this.landline = landline;
		this.website = website;
		this.email = email;
		this.address = address;
		this.home = home;
	}
	@Override
	public String toString() {
		return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob + ", mobileno=" + mobileno
				+ ", work=" + work + ", landline=" + landline + ", website=" + website + ", email=" + email
				+ ", address=" + address + ", home=" + home + "]";
	}
	
	
}
