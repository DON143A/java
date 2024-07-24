\\6TH
  import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the grade of the employee: ");
        String grade = scanner.nextLine().trim().toUpperCase();
        
        System.out.print("Enter the employee salary: ");
        double salary = scanner.nextDouble();
        
        double bonus = 0.0;
        
        if (grade.equals("A")) {
            bonus = salary * 0.05;
        } else if (grade.equals("B")) {
            bonus = salary * 0.10;
        }
        
        if (salary < 10000) {
            bonus += salary * 0.02;
        }
        
        double totalSalary = salary + bonus;
        
        System.out.printf("Salary = %.2f%n", salary);
        System.out.printf("Bonus = %.2f%n", bonus);
        System.out.printf("Total to be paid: %.2f%n", totalSalary);
    }
}
\\7TH
  import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("N = ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer for N.");
            return;
        }
        
        int count = 0;
        int num = 1;
        
        while (count < n) {
            if (isPerfect(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
    
    private static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
\\8TH
  import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the marks in python: ");
        double python = scanner.nextDouble();
        
        System.out.print("Enter the marks in c programming: ");
        double cProgramming = scanner.nextDouble();
        
        System.out.print("Enter the marks in Mathematics: ");
        double mathematics = scanner.nextDouble();
        
        System.out.print("Enter the marks in Physics: ");
        double physics = scanner.nextDouble();
        
        double total = python + cProgramming + mathematics + physics;
        double aggregate = total / 4;
        
        System.out.printf("Total = %.2f%n", total);
        System.out.printf("Aggregate = %.2f%n", aggregate);
        
        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }
    }
}
\\9TH
  import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sumPositive = 0;
        double sumNegative = 0;
        int countPositive = 0;
        int countNegative = 0;
        
        while (true) {
            System.out.print("Enter the number: ");
            int number = scanner.nextInt();
            
            if (number == -1) break;
            
            if (number > 0) {
                sumPositive += number;
                countPositive++;
            } else if (number < 0) {
                sumNegative += number;
                countNegative++;
            }
        }
        
        double avgPositive = countPositive == 0 ? 0 : sumPositive / countPositive;
        double avgNegative = countNegative == 0 ? 0 : sumNegative / countNegative;
        
        System.out.printf("The average of negative numbers is: %.1f%n", avgNegative);
        System.out.printf("The average of positive numbers is: %.7f%n", avgPositive);
    }
}
\\10TH
  import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;
        
        while (true) {
            System.out.print("Enter any character: ");
            char ch = scanner.next().charAt(0);
            
            if (ch == '*') break;
            
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }
        
        System.out.printf("Total count of upper case: %d%n", uppercaseCount);
        System.out.printf("Total count of lower case: %d%n", lowercaseCount);
        System.out.printf("Total count of numbers: %d%n", numberCount);
    }
}
