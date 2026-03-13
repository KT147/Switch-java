public class SeventhChellenge {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-101));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int comparebleNumber = number;

        while (number > 0) {

            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
            System.out.println(reverse);
            System.out.println(comparebleNumber);

        }
        if (reverse == comparebleNumber) {
            return true;
        } else {
            return false;
        }

    }

}
