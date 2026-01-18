package setif;

import java.util.TreeSet;

public class Comparable_demo {

	public static void main(String[] args) {
		Student_1 A=new Student_1(90,"ram");
		Student_1 B=new Student_1(87,"sham");
    	Student_1 C =new Student_1(45,"ssham");
		Student_1 D=new Student_1(67,"sham");
		
		//System.out.println(A.compareTo(B));
		TreeSet<Student_1> Set=new TreeSet<Student_1>();
		Set.add(A);
		Set.add(B);
		Set.add(C);
		Set.add(D);
		System.out.println(Set);
		TreeSet<String> set2=new TreeSet<String>();
		set2.add("A");
		set2.add("k");
		set2.add("Y");
		set2.add("B");
		System.out.println(set2);
		

	}

}
class Student_1 implements Comparable<Student_1>{
	int marks;
	String name;
	
	public Student_1(int marks,String name) {
		this.marks=marks;
		this.name=name;
	}
	public String toString() {
		return this.marks+""+this.name;
	}
	@Override
	public int compareTo(Student_1 o) {
	    System.out.println("TreeSetcalling the CompareTo to decide the oreder...");
		return Integer.compare(this.marks,o.marks);
	}
	
	
}