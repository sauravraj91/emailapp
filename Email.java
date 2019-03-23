package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int defaultPasswordLength = 8;
	private String email;
	private String companySuffix = "company.com";
	private int mailboxCapacity = 500;
	private String alternateEmail;

	// constructor to receive the first name and last name

	public Email(String firstName, String lastName) {
		this.firstName = firstName; // the this keyword refers to class level variable
		this.lastName = lastName; // if this keyword is not used then we are referring to the local variable
		//System.out.println("EmailCreated:  " + this.firstName + this.lastName);

		// call a method asking for department - return department
		this.department = setDepartment();
		System.out.println("WELCOME NEW USER : " + firstName +" "+ lastName + "\nDepartment is :-" + this.department);

		// call a method that returns random password

		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your new generated password is : " + this.password);

		// combine elements to generate email

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is :" + this.email);

	}

	// ask for department

	private String setDepartment() {
		System.out.println(
				"Department Codes below -:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return " Development";
		} else if (depChoice == 3) {
			return "Accounting";
		} else {
			return " ";
		}
	}

	// generate a random password

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// set the mailbox capacity

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// set the alternate email

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// change the password

	public void changePassword(String password) {
		this.password = password;
	}

	public int getmailboxCapacity() {
		return mailboxCapacity;
	}

	public String getalternateEmail() {
		return alternateEmail;
	}

	public String getpassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name : " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL :-" + email + 
				"\nMAILBOX CAPACITY :" + mailboxCapacity + "mb";
	}

}
