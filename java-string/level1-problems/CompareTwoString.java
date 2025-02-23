import java.util.Scanner;


public class CompareTwoString{
    // This method takes 2 String arguments & return a boolean value.
    public static boolean compareUsingCharAt(String str1, String str2) {

        //Base case: if the lengths are different, there is no point in comparing them further
        if (str1.length() != str2.length()) {
            return false;
        }
        // using for loop iterates on each character of the strings.
        for(int i=0; i<str1.length(); i++) {
            // Here I compare character-by-character using the charAt() method.
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = s.next();

        System.out.print("Enter second string: ");
        String str2 = s.next();

        boolean charAtComparison = compareUsingCharAt(str1, str2); // here i call the methode & store the result in charAtComparison variable

        boolean equalsComparison = str1.equals(str2);
        System.out.println("Comparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + equalsComparison);

        // Now checks if the results from both comparison methods are the same
        if (charAtComparison == equalsComparison) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
    }
}
