package javaPrograms;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class getInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"adsd","farm"};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		Scanner  si=new Scanner(System.in);
		System.out.println("Please type some input");
	
		int i = 2;
		i=i+Integer.parseInt(si.nextLine());
		System.out.println(i);

	}

}
