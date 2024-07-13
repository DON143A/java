import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Ram hit a ball, the hit ball flew far after it was hit.";
        String[] banned = {"hit"};

        String result = mostCommonWord(paragraph, banned);
        System.out.println("Output: " + result);
    }

    static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();

        // Replace punctuations with spaces and convert to lowercase
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
        String[] words = normalizedStr.split("\\s+");

        for (String word : words) {
            if (!bannedWords.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}