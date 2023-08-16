package _3_DoubleTrouble;

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a num");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
		// TODO Auto-generated method stub

	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}


}
