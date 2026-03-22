package functional_interfaces;

import java.util.function.Predicate;

public class Third {

	public static void main(String[] args) {
		Predicate<String> pred =(s)->{
			StringBuffer sb=new StringBuffer(s);
			String s2=sb.reverse().toString();
			return s.equals(s2);
		};
		Predicate<String> pred2=(i)->{ return i.length()>4;};
		
		System.out.println(pred.test("anna"));
		 Predicate<String> p3=pred.and(pred2);
		    
		    System.out.println(p3.test("aaaaaa"));
		    Predicate<String> p=Predicate.isEqual("um");
		    System.out.println(p.test("um"));

	}

}
