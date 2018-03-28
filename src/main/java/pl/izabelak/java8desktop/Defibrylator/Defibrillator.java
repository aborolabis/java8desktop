package pl.izabelak.java8desktop.Defibrylator;

import static pl.izabelak.java8desktop.Defibrylator.StringUtils.doDouble;

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

    public static Defibrillator createDefibrillator(String defib) {
        String[] splitedDefib = defib.split(";");
        int id = Integer.valueOf(splitedDefib[0]);
        String name = splitedDefib[1];
        String address = splitedDefib[2];
        String phone = splitedDefib[3];
        String longitude = splitedDefib[4];
        String latitude = splitedDefib[5];

        return new Defibrillator(id, name, address, phone, new Point(doDouble(longitude), doDouble(latitude)));
    }
}
