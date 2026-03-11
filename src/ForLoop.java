public class ForLoop {
    public static void main(String[] args) {
//        for (int counter = 1; counter <= 5; counter++) {
//            System.out.println(counter);
//        }

//        for (double rate = 2.0; rate <= 5.0; rate++) {
//            System.out.println(calculateInterest( 10000, rate));
//        }

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            if (rate > 8.5) {
                break;
            }
            System.out.println("€" + calculateInterest( 100, rate));
        }


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
