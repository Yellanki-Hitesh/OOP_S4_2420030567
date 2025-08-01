package strings;
import java.util.Scanner;
public class ReadAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = input.nextLine();

        System.out.println("You typed: " + message);
    }
}


	