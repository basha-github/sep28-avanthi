package org.hp.prj;

class LimitExceedsException extends Exception{
	
	String message;

	public LimitExceedsException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "LimitExceedsException [message=" + message + "]";
	}
	
	
	
}

interface Bank{
	
	void deposit(int amt) throws LimitExceedsException,ArrayIndexOutOfBoundsException;
}

class SBIBank implements Bank{

	int balance =5000;
	@Override
	public void deposit(int amt) throws LimitExceedsException {
		
		if(amt > 50000) {
			throw new LimitExceedsException("50K is more to deposit");
		}
		else {
			this.balance = this.balance + amt;
		}
		
		
	}
	
}


public class ExceptionDemo {

	public static void main(String[] args)  throws Exception {
		
		
		
		// throw... throws
		
		System.out.println("1111");
		System.out.println("22222");
		System.out.println("333333333");
		
		throw new Exception("Avanthi Exception..");
		
		
		
		
	}

}
