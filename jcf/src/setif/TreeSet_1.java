package setif;

import java.util.TreeSet;

public class TreeSet_1 {

	public static void main(String[] args) {
		TreeSet<Student>tree=new TreeSet<Student>();
		
		Student s1=new Student(2,"ttyf");
		Student s2=new Student(3,"yyy");
		tree.add(s1);
		tree.add(s2);
		System.out.println(tree);
	

	}

}
class Student implements Comparable<Student>{
	int marks;
	String name;
	
	public Student(int marks,String name) {
		this.marks=marks;
		this.name=name;
	}
	public String toString() {
		return this.marks+""+this.name;
	}
	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(this.name.length(),o.name.length());
		//this gives in ascending order
	}
	//public int compareTo(Student o){
	//return Integer.Compare(o.marks,this.marks);
	// this gives in descending order}
	
}
