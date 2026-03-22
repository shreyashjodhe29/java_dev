package info;

public class Fourth {

	public static void main(String[] args) {
		int i=50;
		
		try {
			if(i<100) {
				throw new InvalidOperationException("galat hai");
			}
			System.out.println("sahi ahe");
		}
		catch(InvalidOperationException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("kam zala");
		}

	}

}
class InvalidOperationException extends Exception{
	public InvalidOperationException(String str) {
		super(str);
	}
}