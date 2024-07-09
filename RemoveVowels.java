public class RemoveVowels {
    public static void main(String[] args) {
        String input = "we can play the game";
        String result = removeVowels(input);
        System.out.println("The string without vowels is: " + result);
    }
    
    public static String removeVowels(String str) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) == -1) {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}
