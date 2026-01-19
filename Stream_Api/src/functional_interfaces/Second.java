package functional_interfaces;

import java.util.function.Predicate;

public class Second {

	public static void main(String[] args) {
		// chacking no.even or not
		Predicate<Integer> pred=(i)->{  return i%2==0;};
		System.out.println(pred.test(34));
	}

}
