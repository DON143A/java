1: Determining Color in the Visible Spectrum
import java.util.Scanner;
public class ColorRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a wavelength (in nanometers): ");
        double wavelength = scanner.nextDouble();

        if (wavelength >= 380 && wavelength < 450) {
            System.out.println("The color is Violet");
        } else if (wavelength >= 450 && wavelength < 495) {
            System.out.println("The color is Blue");
        } else if (wavelength >= 495 && wavelength < 570) {
            System.out.println("The color is Green");
        } else if (wavelength >= 570 && wavelength < 590) {
            System.out.println("The color is Yellow");
        } else if (wavelength >= 590 && wavelength < 620) {
            System.out.println("The color is Orange");
        } else if (wavelength >= 620 && wavelength <= 750) {
            System.out.println("The color is Red");
        } else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }

        scanner.close();
    }
}





2: Determining the Next Color for a Stop Light

import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color code (0 for Red, 1 for Green, 2 for Yellow): ");
        int currentColor = scanner.nextInt();
        String nextColor;

        if (currentColor == 0) {
            nextColor = "Green";
        } else if (currentColor == 1) {
            nextColor = "Yellow";
        } else if (currentColor == 2) {
            nextColor = "Red";
        } else {
            nextColor = "Invalid color";
        }

        if ("Invalid color".equals(nextColor)) {
            System.out.println(nextColor);
        } else {
            System.out.println("Next Traffic Light is " + nextColor);
        }

        scanner.close();
    }
}




3: Determining the Next Color for a Stop Light Using Switch

import java.util.Scanner;

public class TrafficLightSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color code (0 for Red, 1 for Green, 2 for Yellow): ");
        int currentColor = scanner.nextInt();
        String nextColor;

        switch (currentColor) {
            case 0:
                nextColor = "Green";
                break;
            case 1:
                nextColor = "Yellow";
                break;
            case 2:
                nextColor = "Red";
                break;
            default:
                nextColor = "Invalid color";
                break;
        }

        if ("Invalid color".equals(nextColor)) {
            System.out.println(nextColor);
        } else {
            System.out.println("Next Traffic Light is " + nextColor);
        }

        scanner.close();
    }
}