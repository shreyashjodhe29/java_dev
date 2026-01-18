package listif;
import java.util.*;
public class Sixth {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		Student st=new Student();
		st.id=12;
		st.name="ram";
		st.email="abc@gmail.com";
		
		Student st2=new Student();
		st2.id=23;
		st2.name="dfs";
		st2.email="sd@gmail.com";
		list.add(st);
		list.add(st2);
		
		Student st3= new Student();
		st3.id=231;
		st3.name="ganesh";
		st3.email="g@gmail.com";
		
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println( "Setting"+list.set(1, st3));
		//System.out.println(list.set(1,st3);
		System.out.println(list);
	}

}
class Student{
	int id;
	String name;
	String email;
	
	public String toString(){
		return this.id+" "+this.name;
	}
	
}
