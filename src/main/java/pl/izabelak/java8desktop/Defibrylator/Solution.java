package pl.izabelak.java8desktop.Defibrylator;

import java.util.Scanner;

public class Solution {

    // metoda zamienia string na typ double.
    static double doDouble(String number){
        String replaced = number.replace(',', '.');
        return Double.valueOf(replaced);
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String LON = in.next();
        String LAT = in.next();
        Point userLocation = new Point(doDouble(LON), doDouble(LAT));
        User user = new User(userLocation);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        Defibrillator nearest = null;

        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            Defibrillator defibrillator = createDefibrillator(DEFIB);
            if(nearest == null){
                nearest = defibrillator;
            }
            if(userLocation.distanceTo(nearest.getLocation()) > userLocation.distanceTo(defibrillator.getLocation())){
                nearest = defibrillator;
            }
        }

        System.out.println(nearest.getName());
    }

    private static Defibrillator createDefibrillator(String defib) {
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
