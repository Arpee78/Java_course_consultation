package week04.day4;

public class Numbers {

    public int sumOfDigits1(int number) {
        char[] n = String.valueOf(number).toCharArray();
        int sum = 0;
        for (char c : n) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }

    public int sumOfDigits2(int number) {
        String s = "" + number;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }

    public int sumOfDigits3(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public int sumOfDigits4(int number) {
        int sum;
        for (sum = 0; number > 0; sum += number % 10, number /= 10) ;
        return sum;
    }

    public int sumOfDigits5(int no) {
        return no == 0 ? 0 : no % 10 + sumOfDigits5(no / 10);
    }

}
