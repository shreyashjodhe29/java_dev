package constructor;

public class Constructor_injection {

	public static void main(String[] args) {
		Car1 car=new Car1(1,"honda");
		System.out.println(car.id);
		System.out.println(car.name);
		

	}

}
class Car1{
	int id;
	String name;
	public Car1(int id,String name) {
		this.id=id;
		this.name=name;
	}
}