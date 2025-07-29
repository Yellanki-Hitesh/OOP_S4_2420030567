package thepackage;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int num=sc.nextInt();
        if(num>0 && num%2==0) {
        	System.out.println("Number is even.");
        }else if(num>0 && num%2!=0) {
        	System.out.println("Number is odd.");
        }else {
        	System.out.println("Enter a positive number!");
        }
	}

}
