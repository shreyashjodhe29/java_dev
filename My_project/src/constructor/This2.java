package constructor;

public class This2 {

	public static void main(String[] args) {
		Demo d=new Demo(12);
		

	}

}
class Demo{
	//want answer ==four-five-three-one-two
	//this. =>Access instance variables
	//this() => Access constructor
	public Demo(){
		this(12,34);// this() can must write in first line of code
		System.out.println("one");
		//this() ==this can not write like this
		// this cannot do recursive call we want to end change somew where
	}
	public Demo(int i) {
		this();
		System.out.println("two");
		
	}
	public Demo(int i, int j) {
		this(34.0);
		System.out.println("three");
	}
	public Demo(float i) {
		System.out.println("four");
		}
	public Demo(double d) {
		this(12.4f);
		System.out.println("five");
	}
}