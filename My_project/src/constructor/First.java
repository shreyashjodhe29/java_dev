package constructor;

public class First {

	public static void main(String[] args) {
		Book book=new Book('h','j');
		book.display();
		

	}

}
class Book{
	double pri;
	public Book(double price) {
		pri=price;
		System.out.println(price);
		System.out.println("good morning");
	}
	public Book( ) {
		System.out.println("non parameterized");
	}
	public Book(char c,char d) {
		System.out.println(c+"------"+d);
	}
	public void display() {
		System.out.println("the price of book"+pri);
	
	}
}