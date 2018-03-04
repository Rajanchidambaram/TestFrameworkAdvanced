package javaPrograms;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class fibo {

	public static void main(String args[]) {

		/*ArrayList<String> a=new ArrayList<>();
		a.add("Hi");
		a.add("it");
		System.out.println(a);
		Iterator it=a.iterator();
		
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o);
		}*/
		
		
		/*Set<String> st= new HashSet<>();
		st.add("2");
		st.add("3");
	
		System.out.println(st);
		Iterator<String> it=st.iterator();
		 {
			System.out.println(it.next());
			System.out.println(it.next());
		}*/
		
		
		String[] source= {"12","34","56"};
		
		
		String[] target= {"34","56","78","34"};
		int count=0;
		
		for(int i=0;i<source.length;i++) {
			
			for (int j = 0; j < target.length; j++) {
				
					Boolean b=source[i].equals(target[j]);
				if(b) {
					
					count++;
					
				}
			}	
		}
		System.out.println(count);
		
		
		
		
		
		
		
	/*HashMap<String, String> mp = new HashMap<String, String>();
	mp.put("rajarajan", "billion");
	System.out.println(mp.entrySet());
	
	HashMap<String, String> mp2 = new HashMap<String, String>();
	mp2.put("rajarajan", "billion");
	mp2.put("rajarajan2", "billion2");
	System.out.println(mp2.entrySet());
	
	Boolean result=mp.equals(mp2);
	System.out.println(result);*/
		
		
		
	
	
	


	}

}
