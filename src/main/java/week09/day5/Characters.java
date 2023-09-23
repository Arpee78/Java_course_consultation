package week09.day5;

public class Characters {

    public char findMostCommonChar(String text) {
        validateString(text);

        char topChar = ' ';
        int topCount = 0;

        for (char c : text.toCharArray()) {
            char currentChar = c;
            int currentCount = getCharCount(text, currentChar);

            if (topCount < currentCount) {
                topCount = currentCount;
                topChar = c;
            }
        }

        return topChar;
    }

    private void validateString(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("String cannot be empty or contain only white spaces!");
        }
    }

    private int getCharCount(String text, char currentChar) {
        int count = 0;

        for (char c : text.toCharArray()) {
            if (c == currentChar) {
                count++;
            }
        }
        return count;
    }
}
