package Operators;
import java.util.Scanner;
public class ArthimeticOperators {

	public static void main(String[] args) {
		// Addition,Subtraction,Multiplication,
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b=sc.nextInt();
		int sum=a+b;
		int difference=a-b;
		int product=a*b;
		int divisor=a/b;
		int reminder=a%b;
		System.out.println("Sum of "+a+ " and " +b+ " is "+sum);
		System.out.println("Differnce of "+a+ " and " +b+ " is "+difference);
		System.out.println("Product of "+a+ " and " +b+ " is "+product);
		System.out.println("Divisor of "+a+ " and " +b+ " is "+divisor);
		System.out.println("Reminder of "+a+ " and " +b+ " is "+reminder);
		
		

	}

}
