package pl.izabelak.java8desktop.Defibrylator;

import java.util.Scanner;

import static pl.izabelak.java8desktop.Defibrylator.Defibrillator.createDefibrillator;
import static pl.izabelak.java8desktop.Defibrylator.StringUtils.doDouble;

public class Solution {

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

}
