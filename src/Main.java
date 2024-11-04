import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = InputHelper.getRangedInt(scan, "Enter your birth Year", 1950,2010);
        int month = InputHelper.getRangedInt(scan, "Enter your birth Month", 1,12);
        int day = InputHelper.getRangedInt(scan, "Enter your birth day", 1,31);
        int hour = InputHelper.getRangedInt(scan, "Enter your birth hour", 1,24);
        int minute = InputHelper.getRangedInt(scan, "Enter your birth minute",1,59);

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
}
}