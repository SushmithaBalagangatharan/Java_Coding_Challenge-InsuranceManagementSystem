package exception;

public class PolicyNotFoundException extends Exception{
	
	public PolicyNotFoundException() {
		System.out.println("Policy is not found!");
	}
	
	public PolicyNotFoundException(String message) {
		super(message);
	}

}
