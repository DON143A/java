import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Please enter a positive integer for N.");
        } else {
            System.out.print("Enter " + N + " digit number: ");
            int number = scanner.nextInt();

            int sum = calculateSingleDigitSum(number);
            System.out.println("Sum of digits (single digit): " + sum);
        }
    }

    static int calculateSingleDigitSum(int num) {
        while (num >= 10) {
            int tempSum = 0;
            while (num > 0) {
                tempSum += num % 10;
                num /= 10;
            }
            num = tempSum;
        }
        return num;
    }
}