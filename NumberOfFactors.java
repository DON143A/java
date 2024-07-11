import java.util.Scanner;

public class NumberOfFactors {
    public static int countFactors(int num) {
        if (num <= 0) return 0;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Given number: ");
        int number = sc.nextInt();

        int factors = countFactors(number);
        System.out.println("Number of factors = " + factors);
    }
}
