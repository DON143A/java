1: Validate a Bank PIN
import java.util.Scanner;

public class ValidatePin {
    public static void main(String[] args) {
        final int VALID_PIN = 1234;
        Scanner scanner = new Scanner(System.in);
        int enteredPin;
        System.out.print("Enter your PIN: ");
        enteredPin = scanner.nextInt();
        while (enteredPin != VALID_PIN) {
            System.out.print("Incorrect PIN. Try again: ");
            enteredPin = scanner.nextInt();
        }
        System.out.println("PIN accepted. Access granted.");
        scanner.close();
    }
}



2: Displaying Multiples of a Number
import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }

        scanner.close();
    }
}

Problem 6_3: Programmatic ASCII Art

public class LoopShape {
    
    public static void createRectangle(int width, int height) {
        if (width < 1 || height < 1) {
            System.out.println("Dimensions must be at least 1.");
            return;
        }
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void createTriangle(int size) {
        if (size < 1) {
            System.out.println("Size must be at least 1.");
            return;
        }
        
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Rectangle 5x4:");
        createRectangle(5, 4);
        
        System.out.println("\nTriangle of size 5:");
        createTriangle(5);
    }
}