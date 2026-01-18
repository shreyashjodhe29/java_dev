package Linkedlist;
import java.util.ArrayList;
import java.util.LinkedList;

public class First {

public static void main (String []args) {
		
		
			ArrayList<Book> books=new ArrayList<Book>();
				
				
				for(int i=0;i<10000000;i++)
				{
					books.add(new Book(i,"A",34.67,3.5));
				}

				long start_time=System.nanoTime();
		        System.out.println(books.remove(5555679));
		        long end_time=System.nanoTime();
		        System.out.println("time taken:"+(end_time-start_time)/1000);
				
				
				/**
				 * 1 Crore Objects. =>99000 accessing this index.
				 * ArrayList => Search => time taken:367,306,345  =>Constant time
				 * LinkedList=>Search=>2191,2325,2121 =>Linear time
				 * 
				 * accessing 990000 element
				 * ArrayList=>
				 */
			}
		}

		class Book
		{
			int id;
			String name;
			double price;
			double ratings;

			public Book(int id, String name, double price,double ratings)
			{
				this.id=id;
				this.name=name;
				this.price=price;
				this.ratings=ratings;
			}
			
			
		
	}


