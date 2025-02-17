import java.util.*;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if a number is divisible by 5
        boolean isDivisible = (number % 5 == 0);
        System.out.printf("Is the number %d divisible by 5? %b%n", number, isDivisible);
    }
}
