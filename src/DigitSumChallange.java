public class DigitSumChallange {
    public static void main(String[] args) {
    System.out.println(sumDigits(1234));
    }
    public static int sumDigits(int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        return sum;
    }
}
