package javaPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class getFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	File fil=new File("./abc.txt");
	System.out.println(fil);
	while(fil.exists()) {
		
		Scanner sc=new Scanner(fil);
		
		while(sc.hasNext()) {
			
			System.out.println(sc.nextLine());
			
		}
		sc.close();
	}

	}

}
