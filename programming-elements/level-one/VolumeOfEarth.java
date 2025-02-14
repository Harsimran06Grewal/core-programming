public class VolumeOfEarth {
    public static void main(String[] args) {
        //radius in kilometers
        int radiusKiloMeters = 6378;

        //volume of earth in kilometers
        double volumeKiloMeters = (4.0 / 3.0) * 3.14 * radiusKiloMeters * radiusKiloMeters * radiusKiloMeters;

        //radius in miles
        double radiusMiles = 6378 * 0.6;

        //volume of earth in kilometers
        double volumeMiles = (4.0 / 3.0) * 3.14 * radiusMiles * radiusMiles * radiusMiles;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKiloMeters + " and cubic miles is " + volumeMiles);
    }
}
