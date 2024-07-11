import java.util.Scanner;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num <= 0) return false;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Given Number: ");
        int number = sc.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println("It’s a Perfect Number");
        } else {
            System.out.println("It’s not a Perfect Number");
        }
    }
}
