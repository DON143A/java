import java.util.Scanner;

public class PerfectSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            double sqrt = Math.sqrt(number);
            System.out.println("Square Root: " + sqrt + ", " + (-sqrt));
        }
    }
}