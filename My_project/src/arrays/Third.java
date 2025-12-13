package arrays;

public class Third {

	public static void main(String[] args) {
		int people[]=new int[1500];
		int counter=0;
		for(int i=0;i<people.length;i++) {
			if(i%7==0) {
				counter++;
				
			}
			people[i]=i;
		}
		System.out.println(people[1500]);
		System.out.println("counter"+counter);

	}

}
