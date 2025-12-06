package collections;

import java.util.ArrayList;
import java.util.Iterator;

class linked{
	void dispaly() {
		ArrayList f=new ArrayList();
		f.add("mani");
		f.add("bhuvi");
		f.add("devil");
		
		for(Object i:f) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		f.add("rohan");
		f.add("karthi");
		f.add("mani");
		
		for (Object i:f) {
			System.out.println(i);
		}
		
		Iterator r=f.iterator();
		while(r.hasNext()) {
			System.out.print(r.next());
			System.out.print(" ");
		}
		
		
	}
}


public class linkedlist {
	
	public void intiger() {
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(6);
		b.add(8);
		b.add(9);
		b.add(10);
		
		for(int i:b) {
			System.out.print(i);
			System.out.print(" ");
		}
		
	}

	public static void main(String[] args) {
		
		linkedlist e=new linkedlist();
		e.intiger();
		
		linked w=new linked();
		w.dispaly();
				
		
		ArrayList<String> a=new ArrayList<>();
		
		a.add("bhuvi");
		a.add("mani");
		a.add("kumar");
		a.add("rohan");
		a.add("mani");
		a.add("bhuvi");
		System.out.println();
		
		for(String i:a) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

}
