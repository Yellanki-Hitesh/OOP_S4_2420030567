package familypack;

import java.util.Scanner;

public class FailorPass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Theory marks : ");
		int a=sc.nextInt();
		System.out.println("Enter Practical marks : ");
		int b=sc.nextInt();
		if (a>50 && b>30) {
			System.out.println("Student passed.");
		}else {
			System.out.println("Student failed");
		}
	}


}