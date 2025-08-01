package strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String original = "  Kl University.  ";

		        System.out.println("Original: '" + original + "'");
		        System.out.println("Length: " + original.length());
		        System.out.println("Trimmed: '" + original.trim() + "'");
		        System.out.println("Uppercase: " + original.toUpperCase());
		        System.out.println("Lowercase: " + original.toLowerCase());
		        System.out.println("Substring (6 to 10): " + original.substring(6, 10));
		        System.out.println("Character at index 7: " + original.charAt(7));
		        System.out.println("Index of 'Java': " + original.indexOf("Java"));
		        System.out.println("Replace 'Java' with 'C++': " + original.replace("Java", "C++"));

		        String another = "  hello java world!  ";
		        System.out.println("Equals (case-sensitive): " + original.equals(another));
		        System.out.println("Equals (ignore case): " + original.equalsIgnoreCase(another));
		    }
		}