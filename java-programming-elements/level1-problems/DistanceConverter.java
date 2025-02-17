public class DistanceConverter {
    public static void main(String[] args) {
        double distanceInKm = 10.8;
        // we know that 1km = 1.6 in mile
        double kmToMile = 1.6;
        double distanceInMiles = distanceInKm * kmToMile;
        
        System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
    }
}
