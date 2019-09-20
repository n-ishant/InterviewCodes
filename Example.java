package BasicInterviewCodes;

import java.util.Scanner;

public class Example {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		String num= sc.next();
		
		String new1 = num.replaceAll("[^a-zA-Z0-9-_]", "\n");
		System.out.println(new1);
	}

}