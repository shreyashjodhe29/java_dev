package conditional;

public class Income_tax_calculatir {

	public static void main(String[] args) {
		double income=200000;
		double tax;
		
		if(income<100000) {
			tax=income*0.10;
			System.out.println("the tax is"+tax);
			}
		else if(income>=100000&&income<200000) {
			tax=income*0.20;
			System.out.println("the tax is"+tax);
		}
		else if(income>=200000&&income<500000) {
			tax=income*0.30;
			System.out.println("the tax is"+tax);
		}
		else if(income>=500000&&income<700000) {
			tax=income*0.30;
			System.out.println("the tax is"+tax);
		}
		
	}

}
