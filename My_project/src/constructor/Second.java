package constructor;

public class Second {

	public static void main(String[] args) {
		Laptop lp=new Laptop(123009);
		lp.price=123;
		
		lp.displayprice();
		

	}

}
class Laptop{
	double price;
	public Laptop(double value) {
		price=value;
	}
	public void displayprice() {
		System.out.println("the price is:"+price);
	}
}
