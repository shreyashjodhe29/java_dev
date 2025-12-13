package method;

public class Demo_2 {

	public static void main(String[] args) {
		// signature in method
		Railway rail=new Railway();
		rail.add(20,100);
		rail.sub(10, 6, 8.9);
		 Railway rail2=new Railway();
		 rail2.add(123,234 );
		 rail2.sub(100.3, 34, 89);

	}

}
class Railway{
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void sub(double i,int b,double c) {
		System.out.println(i-b-c);
	}
}
