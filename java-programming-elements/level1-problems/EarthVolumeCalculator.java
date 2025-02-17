public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // r of the Earth in km
        double radiusKm = 6378;

        // Calculate the vol of Earth in cubic km
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert cubic km to cubic miles 
        double volumeMiles3 = volumeKm3 * 0.239913;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}

