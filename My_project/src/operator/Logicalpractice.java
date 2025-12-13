package operator;

public class Logicalpractice {

	public static void main(String[] args) {
		
           int a=5,b=10,c=15;
           int num=12;
           System.out.println(true&&false);
           System.out.println(false&&true);
           System.out.println(true&&true);
           System.out.println(false&&false);
           System.out.println(a<b&&b<c&&a<c);
           System.out.println(a<10&&b>8&&c<12);
           System.out.println(a<b+2&&b>a+3&&c>a+100);
           System.out.println(a!=b&&b!=11&&c!=100);
           System.out.println(true&&false||false&&false||!true);
           System.out.println(!('c'>'d'));
           System.out.println(num++>=num);
	}

}
