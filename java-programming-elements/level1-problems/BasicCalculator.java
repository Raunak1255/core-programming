import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        // here i perform the arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = (number2 != 0) ? number1 / number2 : 0; // Handle division by zero

        System.out.println("The addition, subtraction, multiplication, and division value of " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " 
                           + multiplication + ", and " + division);
    }
}
