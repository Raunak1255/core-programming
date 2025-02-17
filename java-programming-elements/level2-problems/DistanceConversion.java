import java.util.*;

public class DistanceConversion {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Input: Now taking the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Now convert the distance to yards and miles
        double distanceInYards = distanceInFeet / 3;  // 1yard = 3feet
        double distanceInMiles = distanceInYards / 1760;  // 1mile =1760 yards

        // Output: Displaying the results in yards and miles
        System.out.println("The distance is:");
        System.out.println("In yards: " + distanceInYards);
        System.out.println("In miles: " + distanceInMiles);

    }
}
