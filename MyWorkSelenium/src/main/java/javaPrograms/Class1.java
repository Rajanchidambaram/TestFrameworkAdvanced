package javaPrograms;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.xml.transform.Source;

/**
 * @author RajaRajan
 *
 */
public class Class1 {

	public void opera() throws IOException {

		System.out.println("Enter any options from 1 to 4 ");
		Scanner sc = new Scanner(System.in);
		String opt = sc.nextLine();
		System.out.println("Enter string");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer Src = new StringBuffer(buf.readLine());

		switch (opt) {

		case "a":
			Src = Src.reverse();
			System.out.println(Src);
			break;

		case "b":
			char[] Src1 = Src.toString().toCharArray();
			System.out.println(Src1);
			char[] target = new char[10];
			int j = 0;
			for (int i = Src1.length - 1; i >= 0; i--) {
				target[j] = Src1[i];
				j++;
			}

			System.out.println(target);
			break;

		default:
			break;

		}
		
		
	}

	public static void main(String args[]) throws IOException {
		Class1 c1 = new Class1();
		c1.opera();
	}

}
