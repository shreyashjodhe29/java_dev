package functional_interfaces;

import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
		Consumer<Integer> demo=(t)->{ System.out.println(t*3);};
        demo.accept(3);
	}

}
//class Consumer_1 implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer t) {
//		System.out.println(t*3);
//		
//	}
//	

