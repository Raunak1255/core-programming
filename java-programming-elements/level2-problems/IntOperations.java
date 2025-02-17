import java.util.*;

public class IntOperations {
    public static void main(String[] args) {
        // a scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Taking integer values for a, b, and c
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;   // First operation: a+(b*c)
        int result2 = a * b + c;   // Second operation: (a*b)+c
        int result3 = c + a / b;   // Third operation: c+(a/b)
        int result4 = a % b + c;   // Fourth operation: (a%b)+c

        // Now print the results of the integer operations
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

    }
}
