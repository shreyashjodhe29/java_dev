package loops;

public class Sixth {
//Q.sum of double numbers
	public static void main(String[] args) {
		double sum=0;
		for(double num=1.0;num<=1000;num++) {
			if(num%13.5==0) {
				System.out.println(num);
				sum=sum+num;
				//sum+num;
				System.out.println("*");
			}
		}
		System.out.println(sum);

	}

}
