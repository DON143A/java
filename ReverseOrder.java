import java.util.Arrays;

public class ReverseOrder {
    public static void main(String[] args) {
        String word = "MOSQUE";
        
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        
        System.out.print("Alphabetical Order: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}
