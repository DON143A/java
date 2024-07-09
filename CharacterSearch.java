public class CharacterSearch {
    public static void main(String[] args) {
        String inputString = "I am a programmer";
        char searchChar = 'p';
        
        int index = -1;
        
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println(searchChar + " is found in string at index: " + index);
        } else {
            System.out.println(searchChar + " is not found in string.");
        }
    }
}
