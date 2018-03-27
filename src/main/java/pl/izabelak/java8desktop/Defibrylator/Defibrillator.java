package pl.izabelak.java8desktop.Defibrylator;

public class Defibrillator {

    private int id;
    private String name;
    private String address;
    private String phone;
    private Point location;

    public Defibrillator(int id, String name, String address, String phone, Point location) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Point getLocation() {
        return location;
    }
}
