package polymorphism;

public class Javahashcode {

	public static void main(String[] args) {
		Anima t1=new Anima(67.2,"hhh");
		Anima t2=new Anima(67.2,"hhh");
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t1));
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

	}

}
 class Anima{
	 double num;
	 String name;
	 
	 public Anima(double num,String name) {
		 this.num=num;
		 this.name=name;
	 }
}