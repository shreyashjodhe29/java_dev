package listif;

import java.util.ArrayList;
import java.util.*;
public class First {

	public static void main(String[] args) {
		List list= new ArrayList();
		// this is generic list
		//when we cannot fix type then called as generic list we 
		//add any type of element
		list.add(23);
		list.add("fhfh");
		list.add(new int[] {1,2,3});
		System.out.println(list);

	}

}
