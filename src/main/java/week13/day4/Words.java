package week13.day4;

import java.util.HashMap;
import java.util.Map;

public class Words {

    private static final String VOWELS = "aeiou";

    public Map<Character, Integer> calculateVowelsInSentence(String sentence) {
        Map<Character, Integer> result = new HashMap<>();
        for (Character actual : sentence.toLowerCase().toCharArray()) {
            if (VOWELS.contains(actual.toString())) {
                if (!result.containsKey(actual)) {
                    result.put(actual, 0);
                }
                result.put(actual, result.get(actual) + 1);
            }
        }
        return result;
    }

}
