package classes;

public class Static_1 {

	public static void main(String[] args) {
		Animal tiger=new Animal();
		Animal lion=new Animal();
		tiger.name="king";
		lion.name="rular";
		System.out.println(tiger.city="tadoba");
		System.out.println(lion.city="gir");
		System.out.println(tiger.name);
		System.out.println(lion.name);
	}

}
class Animal{
	static String name;
	String city;
}