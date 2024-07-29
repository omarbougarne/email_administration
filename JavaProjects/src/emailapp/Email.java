package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "company.com";

	// Constructor
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created " + this.firstName + " " + this.lastName);
		// Call method
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		// Method for random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		// Cmbine elements to generate
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("your email is:" + email);
	}

	// Ask for department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Finance\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Development";
		} else if (depChoice == 3) {
			return "Finance";
		} else {
			return "";
		}
	}

	// Random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//set email cap
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//alternate email
	public void setAlternateEmail(String altEmail ) {
		this.alternateEmail = altEmail;
	}
	
	
	//change pass
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getchangePassword() {return password;}
	
	public String showInfo() {
		return "Displaying Name: " + firstName + " " + lastName +
				"Company Name: " + email +
				"MailBox Capacity: " + mailboxCapacity + "mb";
	}
}


