package listif;

import java.util.ArrayList;
import java.util.List;

public class Seventh {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(23);
		list.add(24);
		list.add(78);
		
		List<Integer>list2=list.reversed();
		System.out.println(list.reversed());
		//System.out.println(list);
		System.out.println(list2);

	}

}
