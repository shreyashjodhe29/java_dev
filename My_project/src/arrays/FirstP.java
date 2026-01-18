package arrays;

import java.util.Arrays;

public class FirstP {

	public static void main(String[] args) {
		int e[]= {1,2,3,4,5};
		System.out.println(e);
        int []nums=new int [5];
        nums[0]=7;
        nums[1]=67;
        nums[2]=89;
        nums[3]=78;
        nums[4]=90;
        System.out.println(nums[3]);
        System.out.println(e[2]);
        int []t={1,2};
        int[]g=new int [7];
        int []o=new int[] {1,2,3};
        System.out.println(Arrays.toString(o));
        int[]u=new int[6];
        for(int i=0;i>=u.length;i++) {
        	u[i]=i*8;
        }
        System.out.println(Arrays.toString(u));
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i * 10;
        }
      

}}
