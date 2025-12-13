package constructor;

public class This_practice {

	public static void main(String[] args) {
		Demo2 s=new Demo2(12.0);
	}

}
class Demo2{
	//B-G-D-C-A-F-E
	public Demo2(){
		this(23,67);
		System.out.println('A');
	}
	public Demo2(int i) {
		System.out.println('B');
	}
	public Demo2(int i,int j) {
		this(5,9,7);
		System.out.println('C');
	}
	public Demo2(int i,int j,int  k) {
		this(23.0f);
		System.out.println('D');
	}
	public Demo2(double f) {
		this(5.0,7.0);
		System.out.println('E');
	}
	public Demo2(double d,double h) {
		this();
		System.out.println('F');
	}
	public Demo2(float y) {
		this(2);
		System.out.println('G');
	}
}