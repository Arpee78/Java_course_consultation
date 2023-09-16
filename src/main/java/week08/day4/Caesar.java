package week08.day4;

public class Caesar implements Encryption {

    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    @Override
    public String encrypt(String input) {
        char[] chars = input.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 97 && c <= 122) {
                int value = ((c - 97 + offset) % 26);
                value = value < 0 ? 26 + value : value;
                chars[i] = (char) (97 + value);
            }
        }
        return new String(chars);
    }
}
