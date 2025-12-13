package constructor;

public class This_1 {

	public static void main(String[] args) {
		Animals an=new Animals(100,"elephant","nagpur");
		Animals an2=new Animals(1,"q","ftg");
	
		an.displaycity();
		

	}

}
class Animals{
	int id;
	String name;
	String city;
	
	public Animals(int id,String name,String city) {
	     this(21);
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public Animals()
	{
		
		System.out.println("hiii");
	}
	public Animals(int i) {
		this();
		System.out.println("hello");
	}
	public  void displaycity() {
		
		System.out.println(city);
	}
}
