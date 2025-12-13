package constructor;

public class Setter_getter1 {

	public static void main(String[] args) {
		Cars car=new Cars();
		car.setId(21);
		car.setName("skoda");
		String res2=car.getName();
		int res=car.getId();// line no.9 and 10 are very important steps and we cannot get directly =>
		//=>print the output because we can use this to manipulate data easily thats why firstly stored in variable and then get print it
		System.out.println(res);
		System.out.println(res2);
		System.out.println(res+"  "+res2);
	}

}
class Cars{
	int id;
	String name;
	public Cars() {
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
}