package setif;

import java.util.HashSet;

public class Second {

	public static void main(String[] args) {
		HashSet<Book>set = new HashSet<Book>();
		Book b1=new Book(1,34.7);
		Book b2=new Book(2,45.3);
		Book b3=new Book(3,89.0);
		Book b4=new Book(1,34.7);
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());
		System.out.println(b1.equals(b4));
		System.out.println(set);

	}

}
class Book{
	int id;
	double price;
	
	public  Book(int id,double price) {
		this.id=id;
		this.price=price;
		
	}
	public String toString(){
		return this.id+""+this.price;
	}
	public int hashCode() {
		return this.id+(int)+this.price;
	}
	public boolean equals(Object obj) {
		Book b=(Book)obj;
		return this.id==b.id && this.price==b.price;
	}
	
}
