package operator;

public class Practice {

	public static void main(String[] args) {
		int num=12;
		int sum=-9;
		System.out.println(num++>=num);//12>=13
		System.out.println(num++!=num);
		System.out.println(100>=100);
		System.out.println(--sum<=sum--);
		                   //-8<=-8, -7
		System.out.println(sum--<=sum--);
		                   //-9<=-8,-7
		System.out.println(-108>-109);
		int num1=101;
		int num2=102;
		int num3=100;
		System.out.println(++num1>=num2++&&--num3!=--num3&&!false);
		                  //true&&true&&true
		System.out.println(++num1>=num2++&&--num3>--num3&&!false);
		

	}

}
