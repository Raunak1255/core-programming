import java.util.*;
public class TriangleArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double height = sc.nextDouble();

        // here i calculate the area of the triangle in inches
        double areaInInches = 0.5 * base * height;

        // now convert inches into cm (1sqInch = 6.4516 cm²)
        double areaInCentimeter = areaInInches * 6.4516;

        // Now print the area and height conversion
        double heightInCm = height * 2.54; //1inch = 2.54cm
        double heightInFeet = height / 12; //1foot = 12inches
        double heightInInches = height; // bcz height already in inches

        System.out.println("The area of the triangle is:");
        System.out.println("In square inches: " + areaInInches);
        System.out.println("In square centimeters: " + areaInCentimeter);
        
        System.out.println("\nYour Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);


    }
}