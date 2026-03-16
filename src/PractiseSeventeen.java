public class PractiseSeventeen {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime (int number) {
        if (number <= 1) {
            return -1;
        }
        int largestPrime = 0;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }
        return largestPrime;
    }
}
