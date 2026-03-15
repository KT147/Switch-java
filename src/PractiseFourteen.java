public class PractiseFourteen {
    public static void main(String[] args) {
        System.out.println(numberToWords(100));
        System.out.println(reverse(-123));
    }

    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        int digitCount = getDigitCount(number);
        int reversedNumber = reverse(number);

        String text = "";

        for (int i = 0; i < digitCount; i++) {

            int digit = reversedNumber % 10;

            String word = switch (digit) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "";
            };

            text += word + " ";

            reversedNumber = reversedNumber / 10;
        }

        return text;
    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }
        return reversedNumber;

    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        int count = 0;

        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

}
