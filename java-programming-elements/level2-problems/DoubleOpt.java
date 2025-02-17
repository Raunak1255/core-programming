import java.util.*;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");

        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();
        double result1 = a + b * c;   // First operation: a+(b*c)
        double result2 = a * b + c;   // Second operation:(a*b)+c
        double result3 = c + a / b;   // Third operation: c+(a/b)
        double result4 = a % b + c;   // Fourth operation: (a%b)+c

        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
