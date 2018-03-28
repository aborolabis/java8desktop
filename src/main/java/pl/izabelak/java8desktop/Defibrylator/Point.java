package pl.izabelak.java8desktop.Defibrylator;

public class Point {

    private final double EARTH_RADIUS = 6371.0;

    private double longitude;
    private double latitude;

    public Point(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double distanceTo(Point B) {
        double x = (B.longitude - longitude) * Math.cos((latitude + B.latitude) / 2);
        double y = B.latitude - latitude;
        double d = Math.sqrt(x * x + y * y) * EARTH_RADIUS;
        return d;
    }
}
