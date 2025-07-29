package anotherpackage;
import java.util.Scanner;
public class GradingStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks in the following order Math,Phy,Chem,Lang : ");
		int math= sc.nextInt();
		int phy=sc.nextInt();
		int chem=sc.nextInt();
		int lang=sc.nextInt();
		int marks= (math+phy+chem+lang);
		System.out.println("Total obtained marks : "+marks);
		if ((marks/2)>=90) {
			System.out.println("A grade");
		}else if ((marks/2)>=80) {
			System.out.println("B grade");
		}else if((marks/2)>=70) {
			System.out.println("C grade");
		}else {
			System.out.println("FAILED");
		}
	}

}
