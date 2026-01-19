package functional_interfaces;

import java.util.function.Predicate;

public class Third {

	public static void main(String[] args) {
		Predicate<String> pred =(s)->{
			StringBuffer sb=new StringBuffer(s);
			String s2=sb.reverse().toString();
			return s.equals(s2);
		};
		System.out.println(pred.test("anna"));

	}

}
