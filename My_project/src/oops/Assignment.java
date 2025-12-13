package oops;

public class Assignment {

	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.setstudentname("jay");
		System.out.println(s1.getstudentname());
		

	}

}
class Student{
	private String studentname;
	private String rollnumber;
	private String adharnumber;
	private String email;
	private String phonenumber;
	private int[]marks=new int[5];
	String departname;
	String collegename;
	int age;
	int year;
	String address;
	 
	 public void setstudentname(String studentname) {
		 this.studentname=studentname;
	 }
	 public String getstudentname() {
		 return this.studentname;	
	 }
	 public void setrollnumber(String rollnumber) {
		 if(rollnumber.length()==4) {
			 this.rollnumber=rollnumber;
		 }
		 else {
			 System.out.println("enter valid roll number")
		 }
	 }
	 public String getrollnumber() {
		 return this.rollnumber;
	 }
	 public void setadharnumber(String adharnumber) {
		 if(adharnumber.length()==12) {
			 this.adharnumber=adharnumber;
		 }
		 else {
			 System.out.println("eneter valid adhar number");
		 }
	
	 }
	 public String getadharnumber() {
		 return this.adharnumber;
	 }
	 public void setemail(String email) {
		  if (email.contains("@")) {
	            this.email = email;
	        } else {
	            System.out.println("Invalid Email must contain '@' symbol.");
	        }}
	 public String getemail() {
		 return this.email;
	 }
	 public void phonenumber(String phonenumber) {
		 String onlyNonDigits = phonenumber.replaceAll("[0-9]", "");
         if (onlyNonDigits.isEmpty()) {
             this.phonenumber = "91" + phonenumber; // add +91 prefix
         } else {
             System.out.println("Invalid phone number (contains alphabets or symbols)");
	 }
}
	 public String getphonenumber() {
		 return this.phonenumber;
	 }
	 public void setmarks(int marks[]) {
		 this.marks=marks; 
	 }
	 public int[] getmarks() {
		 return this.marks;
	 }
}