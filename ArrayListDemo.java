package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList friends = new ArrayList();
		friends.add("MAdhu");
		friends.add("sai");
		friends.add("vinnu");
		
		System.out.println(friends);
		
		Iterator friendsItr= friends.iterator();
		while(friendsItr.hasNext()) {
			System.out.println(friendsItr.next());
		}
		
	}

}
