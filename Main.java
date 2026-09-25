import java.util.*;
public class Main {
    static void printFilteredWordFrequency(String feedback) {
        // Stop words
        Set<String> stopWords = new HashSet<>(
            Arrays.asList("the", "was", "and", "a", "is", "of", "in")
        );
        // Convert to lowercase
        String text = feedback.toLowerCase();
        // Remove punctuation
        text = text.replace(".", "");
        text = text.replace(",", "");
        // Split into words
        String[] words = text.split("\\s+");
        // Store word frequencies
        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            // Skip stop words
            if (stopWords.contains(word)) {
                continue;
            }
            // Count frequency
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list =
            new ArrayList<>(frequency.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(
                entry.getKey() + ": " + entry.getValue()
            );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter feedback:");
        String feedback = sc.nextLine();
        printFilteredWordFrequency(feedback);

        sc.close();
    }
}