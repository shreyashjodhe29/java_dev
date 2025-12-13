package constructor;

public class Setter_getter {

	public static void main(String[] args) {
		Toyota fortuner=new Toyota();
		fortuner.setNo(12);
		int res=fortuner.getNo();
		fortuner.setName("Legender");
		String res2=fortuner.getName();
		System.out.println(res);
		System.out.println(res2);

	}

}
class Toyota{
	int no;
	String name;
	public void setNo(int no) {
		this.no=no;
		}
	
		public void setName(String name) {
			this.name=name;
			
		}
		public String getName() {
			return this.name;
		}
		
	
	public int getNo() {
		return this.no;
	}
}
