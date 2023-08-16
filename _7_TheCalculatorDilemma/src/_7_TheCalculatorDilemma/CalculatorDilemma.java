package _7_TheCalculatorDilemma;

import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first number");
		int num1=scan.nextInt();
		System.out.println("Enter a second number");
		int num2=scan.nextInt();
		char Operator='+';
		double res=performOperation(num1, num2, Operator);
		System.out.println("Result:"+res);
		
	}
	public static double performOperation(double num1, double num2, char operator) {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }

        return result;
}

}