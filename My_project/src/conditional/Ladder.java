package conditional;

public class Ladder {

	public static void main(String[] args) {
		double marks=77;
		
		if(marks>=35&&marks<=45) {
			System.out.println("paased in third division");
		}
		else if(marks>45&&marks<=60) {
			System.out.println("paased in second division");
		}
		else if(marks>60&&marks<=75) {
			System.out.println("paased in first division");
		}
		else if(marks>75&&marks<=100) {
			System.out.println("paased in distinction");
		}
		else {
			System.out.println("you are failed or invalid marks");
		}

	}

}
