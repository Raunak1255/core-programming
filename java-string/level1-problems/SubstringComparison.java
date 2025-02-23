import java.util.Scanner;

public class SubstringComparison {
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for(int i=start; i<end; i++){
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareSubstrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;  // bcz substrings of different lengths cannot be equal.
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = s.nextLine();  // nextLine() : read the entire line of text input by the user and stores it in the text variable.

        System.out.print("Enter start index: ");
        int start = s.nextInt();  // reads the integer input for the start index and stores it in the start variable.

        System.out.print("Enter end index: ");
        int end = s.nextInt();

        String substringCharAt = createSubstring(text, start, end);
        String substringMethod = text.substring(start, end);
        boolean areEqual = compareSubstrings(substringCharAt, substringBuiltIn);

        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using substring(): " + substringMethod);
        System.out.println("Both substrings are identical " + areEqual);
    }
}
