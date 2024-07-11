import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the number of years: ");
        double years = sc.nextDouble();

        System.out.print("Is customer senior citizen (y/n): ");
        char seniorCitizen = sc.next().charAt(0);

        double rateOfInterest = (seniorCitizen == 'y' || seniorCitizen == 'Y') ? 0.12 : 0.10;
        double interest = principal * rateOfInterest * years;

        System.out.println("Interest: " + interest);
    }
}
