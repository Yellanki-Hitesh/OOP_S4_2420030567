package thisisalsoapackage;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a= sc.nextInt();
        for (int i=0;i<=10;i++) {
        	System.out.println(+a+ " x " +i+ " = " +(a*i));
        }
	}

}
