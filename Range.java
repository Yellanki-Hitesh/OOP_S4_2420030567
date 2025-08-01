package arraypackage;
import java.util.Scanner;
public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int total = input.nextInt();

        int[] numbers = new int[total];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < total; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < total; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nSmallest: " + min);
        System.out.println("Largest: " + max);
    }
}
