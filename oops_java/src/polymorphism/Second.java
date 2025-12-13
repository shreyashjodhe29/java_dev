package polymorphism;

public class Second {

	public static void main(String[] args) {
		Animal lion=new Animal();
		lion.run(2);
		lion.disp(3);
		lion.run3(3);

	}

}
class Animal{
	public void run() {
		System.out.println("running");
	}
	public void run(int i) {
		System.out.println(i+"running");
	}
	public static void disp() {
		System.out.println("this is display method");
	}
	public static void disp(int i) {
		System.out.println("parameterized static method");
	}
	final void run3() {
		System.out.println("final run 3");
	}
	final void run3(int i) {
		System.out.println("param run3");
	}
}
