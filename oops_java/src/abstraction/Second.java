package abstraction;

public class Second {

	public static void main(String[] args) {
		Ianimal ian =new tiger();
		Idrink ij=new tiger();
		ij.drink("H2o");
		ian.sleep(2);
		
		Ianimal ik=new tiger();
		tiger shera =new tiger();
		


	}

}
//Set of contract.
//100 %
//no constructor
//variables. => static and final.
interface Ianimal{
	
	void eat();
	void sleep(int i);
	void sleep(int i,int j);
	void jump();
	void hund(String str);
	
	
}
interface Idrink{
	int drink(String str);
}
class tiger implements Ianimal,Idrink{
	int a=23;
	public void eat() {
		
	}
	public void sleep(int i) {
		
	}
	public void sleep(int i,int j) {
		
	}
	public void jump() {
		
	}
	public void hund(String str) {
		
	}
	@Override
	public int drink(String str) {
		// TODO Auto-generated method stub
		return 0;
	}
}
