import java.util.Scanner;

public class CompositeNumbers {
    public static boolean isComposite(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A value: ");
        int A = sc.nextInt();
        
        System.out.print("Enter B value: ");
        int B = sc.nextInt();

        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }

        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
