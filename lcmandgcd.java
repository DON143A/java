import java.util.Scanner;

public class LCMAndGCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N value: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Invalid input for N.");
            return;
        }

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int gcdResult = numbers[0];
        int lcmResult = numbers[0];

        for (int i = 1; i < N; i++) {
            gcdResult = gcd(gcdResult, numbers[i]);
            lcmResult = lcm(lcmResult, numbers[i]);
        }

        System.out.println("GCD = " + gcdResult);
        System.out.println("LCM = " + lcmResult);
    }
}
