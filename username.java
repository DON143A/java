import java.util.Scanner;

public class SimpleUsernameValidator {

    public static boolean isValidUsername(String username) {
        if (username.length() < 5 || username.length() > 15) {
            return false;
        }
        if (!Character.isLetter(username.charAt(0))) {
            return false;
        }
        for (char ch : username.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        if (isValidUsername(username)) {
            System.out.println("The username is valid.");
        } else {
            System.out.println("The username is invalid.");
        }
        
        scanner.close();
    }
}
