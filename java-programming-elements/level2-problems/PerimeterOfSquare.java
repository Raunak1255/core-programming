import java.util.*;


public class PerimeterOfSquare {
    public static void main(String[] args) {

        // Here create a scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Here tacking input from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Now I calculate the side of the square (side = perimeter / 4)
        double side = perimeter / 4;

        // Print the side length and the perimeter as output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

    }
}