package javaPrograms;

import javax.crypto.IllegalBlockSizeException;

public class AbstractExample {
	
	public static void main(String args[]) {
		
		String[] aa = {"agf","tre","ytu"};
		String StringResult = aa[0]+aa[1];
		System.out.println(StringResult);
		
		StringBuilder stB=new StringBuilder(StringResult);
		stB.insert(1, 'z');
		System.out.println(stB);
		
	if(stB.toString()=="azgftre") {
		
			try {
				throw new IllegalBlockSizeException();
			} catch (IllegalBlockSizeException e) {
				// TODO Auto-generated catch block
			System.out.println("erro");
			}
			finally {
				System.out.println("Exception done");
			}
		
	}
	
		
	}
	
	
	
	
	
	

}
