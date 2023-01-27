package ifelse;

import java.util.LinkedList;

public class linkedlist extends anand {

	public static void main(String[] args) {

		LinkedList<String> list=new LinkedList<String>();
		list.add("20");
		list.add("Anand");
		list.addFirst("Bhushan");
		list.addLast("mali");
		System.out.println(list);
		list.add(2, "roshan");
		System.out.println(list);
		list.get(2);
		System.out.println(list.get(3));
		System.out.println(list.size());
		list.remove(3);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
