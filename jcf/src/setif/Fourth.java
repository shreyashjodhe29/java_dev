package setif;

import java.util.HashSet;
import java.util.Set;

public class Fourth {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(78);
		set.add(67);
		set.add(87);
		set.add(78);
		set.add(67);
		set.add(78);
		
		System.out.println(set);
	}

}
