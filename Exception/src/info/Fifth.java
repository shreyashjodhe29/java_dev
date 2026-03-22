package info;

public class Fifth {

	public static void main(String[] args) {
		int j=23;
		try {
			if(j>10) {
				throw new InvalidAException("allowed");
			}
			System.out.println("not allowed");
		}
		catch(InvalidAException ex) {
			System.out.println(ex.getMessage());
			}
		finally {
			System.out.println("progaram runned");
		}
		}

	}
class InvalidAException extends Exception{
	public InvalidAException(String s) {
		super(s);
	}
}

