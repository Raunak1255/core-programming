import java.util.*;

class BasicCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        
        // Here i am using ternary operator for division by zero check
        String division = (number2 != 0) ? String.valueOf(number1 / number2) : "undefined (division by zero)";

        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "
                             + number1 + " and " +  number2 + " is "
                             + addition + ", " + subtraction +", " + multiplication
                             + " and " + division);
    }
}
