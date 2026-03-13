public class EightChallenge {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1237));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int lastDigit = number % 10;


        while (number >= 10) {
            number = number / 10;
            System.out.println(number);
        }

        int firstDigit = number;

        sum = lastDigit + firstDigit;
        return sum;
    }
}
