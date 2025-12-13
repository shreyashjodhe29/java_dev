package arrays;

public class Second {

	public static void main(String[] args) {
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i*100;
		}
		System.out.println(arr[9]);
		int arr2[]=new int[1];//means 0th index only
		System.out.println(arr2.length);
		

	}

}
