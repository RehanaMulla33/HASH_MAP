package com.Xworkz.Map;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class HashMap_Put {

	public static void main(String[] args) {
		
		Map hashMap=new HashMap();

		hashMap.put(1,"Karnataka");
		hashMap.put(2,"Madhya Pradesh");
		hashMap.put(3,"Rajasthan");
		hashMap.put(4,"Haryana");
		hashMap.put(5,"Karnataka");
		hashMap.put(null,"UttarPradesh");
		hashMap.put(6,"null");
		hashMap.put(7,"Andra Pradesh");
		hashMap.put(8,"Goa");
		hashMap.put(9,"Punjab");
		hashMap.put(null,null);
		hashMap.put(10,"Jammu & kashmir");
		hashMap.put(1,"Karnataka");
		hashMap.put("Rehana","Karnataka");
		
		System.out.println(hashMap.size());
		System.out.println(hashMap);
		Object object=hashMap.get(8);
		
		System.out.println(object);
		
		Object object1=hashMap.get("Rehana");
		System.out.println(object1);
		
		Set<Entry<Integer,String>> entrySet=hashMap.entrySet();
		
		Iterator<Entry<Integer,String>> iterator=entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer,String> next=iterator.next();
			
			System.out.println("Key :" +next.getKey());
			System.out.println("Value :" +next.getValue());
		}
		
		
		
		
		
		
		
	}

}
