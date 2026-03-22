package info;

public class Third {

	public static void main(String[] args) {
		String str="sunday";
		String str2=str.toLowerCase();
		
		try {
			if(str2.equals("sunday")==false){
				throw(new NoSundayException("not a sunday"));
			}
			System.out.println("aaj sunday ahe");
		}
			catch(NoSundayException ex) {
				System.out.println(ex.getMessage()); 
			}
			finally{
				System.out.println(" ho gya ree");
			}
	}
}
class NoSundayException extends Exception{
	public NoSundayException(String str) {
		super(str);
	}
}