
public class Customer {

	private String userID;
	
	private String userPassword;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String address;
	
	private String zip;
	
	private String city;
	
	private String state;
	
	private String ssn;
	
	private String securityQuestion;
	
	private String securityAnswer;
	
	Customer(String userID, String userPassword, String firstName, String lastName, String email, String address, String zip, String city, String state, String ssn, String securityQuestion, String securityAnswer){
		
		this.userID = userID;
		this.userPassword = userPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.ssn = ssn;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}
	
	boolean checkSSN(Customer x) {
		
		String ssn = x.toString();
		
		if (ssn.length() == 11 && ssn.charAt(3) == '-' && ssn.charAt(6) == '-')
			
			return true;
		
		else 
		
		return false;
		
	}

}