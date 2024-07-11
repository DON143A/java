import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 != 0) return true;
        return year % 400 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Date (dd/mm/yyyy): ");
        String date = sc.next();

        String[] parts = date.split("/");
        if (parts.length != 3) {
            System.out.println("Invalid date format.");
            return;
        }

        int year;
        try {
            year = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid year format.");
            return;
        }

        if (isLeapYear(year)) {
            System.out.println("Given year is a Leap Year");
        } else {
            System.out.println("Given year is Non-Leap Year");
        }
    }
}
