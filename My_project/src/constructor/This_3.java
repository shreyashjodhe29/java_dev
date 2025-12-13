package constructor;

public class This_3 {

	public static void main(String[] args) {
		Car c=new Car();
		c.name="gdg";
		

	}

}
class Car {
	int id;
	String name;
	public Car() {
		this(2);
		System.out.println('A');
	}
	public Car(int i) {
		System.out.println('B');
	}
	
}
