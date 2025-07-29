package sixpack;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean passedPractical = true;
        boolean passedTheory = true;

        if (passedPractical && passedTheory) {
            System.out.println("Student passed in both Practical and Theory.");
        }else {
        	System.out.println("Student Failed");
        }
}
}