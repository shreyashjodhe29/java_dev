package functional_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_2 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(12);
		list1.add(34);
		list1.add(23);
		list1.add(45);
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(19);
		list2.add(56);
		list2.add(89);
		
		List<List<Integer>> list3=new ArrayList<List<Integer>>();
		list3.add(list1);
		list3.add(list2);
		System.out.println(list3);
		Tow_d tow=new Tow_d();
		tow.accept(list3);

	}

}
class First_list implements Consumer<List<Integer>>{
    int sum=0;
	@Override
	public void accept(List<Integer> t) {
		for(int i :t) {
			sum+=i;
		}
		System.out.println(sum);
		
	}
	public int sum() {
		return this.sum;
	}
	
}
class Tow_d implements Consumer<List<List<Integer>>>{

	@Override
	public void accept(List<List<Integer>> t) {
		List<Integer> list4=new ArrayList<Integer>();
		for(List<Integer> list:t)
		{
			First_list list2=new First_list();
			list2.accept(list);
			list4.add(list2.sum());
		}
		System.out.println("final solution:");
		First_list list2=new First_list();
		list2.accept(list4);
		
	}


	
}
