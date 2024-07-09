public class Count {
    public static void main(String[] args) {
        String input = "Engineering";
        StringBuilder consonants = new StringBuilder();
        StringBuilder vowels = new StringBuilder();
        input = input.toLowerCase();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                vowels.append(ch).append(" ");
            } else if (Character.isLetter(ch)) {
                consonants.append(ch).append(" ");
            }
        }
        
        System.out.println("Given Word: " + input);
        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
    }
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
