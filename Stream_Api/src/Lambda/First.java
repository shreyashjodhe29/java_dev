package Lambda;

public class First {

	public static void main(String[] args) {
		I_add<Integer> iadd=(i1,i2)->{
			return i1+12;};
			int sum=iadd.add(23,27);
			System.out.println(sum);
//		I_add<Integer> idd=new I_add<Integer>() {
//
//			@Override
//			public void add(Integer t1, Integer t2) {
//				System.out.println(t1+t2);
//				
//			}
//			
//		};
		iadd.add(98, 22);

	}


interface I_add<T>{
	T add(T t1,T t2);
}}
//class concrete implements I_add<Integer>{
//
//	@Override
//	public void add(Integer t1, Integer t2) {
//		System.out.println(t1+t2);
//		
//	}
	
