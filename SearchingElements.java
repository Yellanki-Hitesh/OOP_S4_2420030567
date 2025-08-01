package arraypackage;
import java.util.Scanner;
public class SearchingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        System.out.print("How many entries? ");
	        int size = input.nextInt();

	        int[] entries = new int[size];

	        System.out.println("Enter the values:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Value " + (i + 1) + ": ");
	            entries[i] = input.nextInt();
	        }

	        System.out.print("Search for: ");
	        int target = input.nextInt();

	        boolean found = false;
	        int position = -1;

	        for (int i = 0; i < size; i++) {
	            if (entries[i] == target) {
	                found = true;
	                position = i;
	                break;
	            }
	        }

	        if (found) {
	            System.out.println("Found at position " + (position + 1));
	        } else {
	            System.out.println("Not found.");
	        }
	    }
	}
