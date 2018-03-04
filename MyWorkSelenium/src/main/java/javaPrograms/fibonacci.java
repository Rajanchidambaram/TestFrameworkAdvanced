package javaPrograms;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b ,r=0;
		 a=0;
		 b=1;
		
		Scanner obj=new Scanner(System.in);
		int i=Integer.parseInt(obj.nextLine());
		 System.out.println(a);
		 System.out.println(b);
		 
		while(b<=i&&(a+b)<=i) {
			r=a+b;
			System.out.println(r);
			
			a=b;
			b=r;
			
		}
		
		
		
		
	}

}
