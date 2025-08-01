package arraypackage;
import java.util.Scanner;
public class AverageOfAStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        int[] scores = new int[6];
        String[] subjects = {"Math", "Physics", "Chemistry", "English", "Computer", "Biology"};

        System.out.println("Enter marks for six subjects:");
        for (int i = 0; i < 6; i++) {
            System.out.print(subjects[i] + ": ");
            scores[i] = input.nextInt();
        }

        int total = 0;
        for (int mark : scores) {
            total += mark;
        }

        int average = total / 6;

        System.out.println("\n--- Scorecard ---");
        for (int i = 0; i < 6; i++) {
            System.out.println(subjects[i] + ": " + scores[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
