package classes;

public class Static_2 {

	public static void main(String[] args) {
		College sgd=new College();
		College ssd=new College();
		sgd.id=90;
		sgd.name="sgd";
		sgd.pincode="111";
		
		ssd.id=9;
		ssd.name="ssd";
		ssd.pincode="22";
College.pincode="eeee";
		
		System.out.println(College.pincode);
		
		System.out.println(sgd.id);
		System.out.println(sgd.name);
		System.out.println(sgd.pincode);
		
		System.out.println("****");
		System.out.println(ssd.id);
		System.out.println(ssd.name);
		System.out.println(ssd.pincode);
		

	}

}
class College{
	int id;
	String name;
	static String pincode;
}
