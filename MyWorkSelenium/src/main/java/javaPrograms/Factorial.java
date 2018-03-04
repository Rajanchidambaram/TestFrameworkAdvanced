package javaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter valid input other than 0 ");
		
		Scanner obj=new Scanner(System.in);
	int a=Integer.parseInt(obj.nextLine());
		try {
		if(a<=0) {
			
			throw new IllegalArgumentException("No 0 and negative numbers can be given as input");
		}
		}
		catch (Exception e) {
		System.out.println("Enter number other than o");	
		}
		
	}

}
