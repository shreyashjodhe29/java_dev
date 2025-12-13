package loops;

public class Third {

	public static void main(String[] args) {
		int sum=0;
		int oddsum=0;
		for(int num=1;num<=5;num++) {
			if(num%2==0) {
				sum=num+sum;
			}else {
				oddsum=num+oddsum;
				//System.out.println("EVEN no sum"+oddsum);
			}
		}System.out.println("ODD no.sum" +oddsum);
		System.out.println("EVEN no.sum"+sum);
	}

}
