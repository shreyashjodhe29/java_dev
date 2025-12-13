package conditional;

public class incomecheck {

	public static void main(String[] args) {
		double income=1000;
		
		if(income>=1&&income<=100000) {
			System.out.println("lower wealth individuals");
		}
		else if(income>=100001&&income<=300000) {
			System.out.println("middle wealth individuals");
		}
		else if(income>=300001&&income<=500000) {
			System.out.println("higher wealth individuals");
		}
		else if(income>=500001) {
			System.out.println("ultra weath individuals");
		}
	}

}
