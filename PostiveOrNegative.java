package timepackage;
import java.util.Scanner;
public class PostiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter a number : ");
          int a= sc.nextInt();
          if(a>0) {
        	  System.out.println("Positive number.");
          }else {
        	  System.out.println("Negative number.");
          }
          
	}

}
