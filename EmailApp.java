package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("SAURAV", "RAJ");

		em1.setAlternateEmail("sauravraj91@gmail.com");
		System.out.println("Your alternate email id is :- " + em1.getalternateEmail());

		em1.changePassword("S@vagaga");
		System.out.println("Your new password is :" + em1.getpassword());
		System.out.println(em1.showInfo());

	}

}
