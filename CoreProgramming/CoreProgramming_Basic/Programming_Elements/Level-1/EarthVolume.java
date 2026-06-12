public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = 3.14;

        double volumeKm = (4.0 / 3) * pi * radiusKm * radiusKm * radiusKm;
        double volumeMiles = volumeKm * 0.239913;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}