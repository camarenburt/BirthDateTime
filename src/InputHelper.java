import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = InputHelper.getRangedInt(scan, "Enter your birth year", 1950,2012);
        int month = InputHelper.getRangedInt(scan, "Enter your birth month", 1,12);
        int day;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            day = InputHelper.getRangedInt(scan, "Enter your birth day of the month", 1,31);
        } else if (month == 2){
            day = InputHelper.getRangedInt(scan, "Enter your birth day of the month", 1,29);
        } else {
            day = InputHelper.getRangedInt(scan, "Enter your birth day of the month", 1,30);
        }
        int hour = InputHelper.getRangedInt(scan, "Enter your birth hour", 1,24);
        int minute = InputHelper.getRangedInt(scan, "Enter your birth minute", 1,59);

        System.out.printf("Year: %10d", year);
        System.out.printf("\nMonth: %9d", month);
        System.out.printf("\nDay: %11d", day);
        System.out.printf("\nHour: %10d", hour);
        System.out.printf("\nMinute: %8d", minute);

    }
}