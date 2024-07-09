public class SpecialCharacters {
    public static void main(String[] args) {
        String input = "input@inside"; 
        
        int specialCharCount = 0;
        StringBuilder specialChars = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialChars.append(ch).append(" ");
                specialCharCount++;
            }
        }
        
        System.out.println("Special characters: " + specialChars);
        System.out.println("Number of special characters: " + specialCharCount);
    }
}