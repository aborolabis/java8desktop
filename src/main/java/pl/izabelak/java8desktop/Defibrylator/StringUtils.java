package pl.izabelak.java8desktop.Defibrylator;

public class StringUtils {

    // metoda zamienia string na typ double.
    public static double doDouble(String number) {
        String replaced = number.replace(',', '.');
        return Double.valueOf(replaced);
    }

}
