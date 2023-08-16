package _4_StringJoiner;

import java.util.Scanner;

public class StringJoin {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First and last name");
		String Firstname = scan.next();
		String lastname = scan.next();
		
		System.out.println(joinStrings(str1,str2));
		
		// TODO Auto-generated method stub

	}
	public static String joinStrings(String str1, String str2) {
		return str1+str2;

	}
	

}
