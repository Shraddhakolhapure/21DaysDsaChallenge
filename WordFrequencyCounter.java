import java.util.HashMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "This is a simple example. This is a test example.";
        String[] words = text.split(" ");

        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": " + wordFrequency.get(word));
        }
    }
}
