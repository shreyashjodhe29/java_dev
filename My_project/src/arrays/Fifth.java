package arrays;

public class Fifth {

	public static void main(String[] args) {
		int num=0;
		int second=0;
		int arrr[]={12,34,56,78};
		for(int i=0;i<arrr.length;i++) {
			if(arrr[i]>num) {
				//System.out.println(arrr[i]);
				second=num;
				num=arrr[i];
				
			}
			System.out.println( "highest :"+num);
			System.out.println("Second:"+second);
		}

	}

}
