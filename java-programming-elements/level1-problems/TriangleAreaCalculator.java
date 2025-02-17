import java.util.*;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in inches): ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle (in inches): ");
        double height = scanner.nextDouble();

        // here Calc the area of triangle in sqinches (1/2 * b*h)
        double areaInInches = 0.5 * base * height;

        // Convert the area to square centimeters (1 inch = 2.54 cm)
        double areaInCentimeters = areaInInches * (2.54 * 2.54);
        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCentimeters + " square centimeters.");

    }
}
