import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        getInputFromScanner();
    }

    public static void getInputFromScanner() {

        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter a number");
            String enteredNumber = scanner.nextLine();

            try {
                int number = Integer.parseInt(enteredNumber);
                if (number < minNumber) {
                    minNumber = number;
                }

                if (number > maxNumber) {
                    maxNumber = number;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Min was " + minNumber + " and max was " + maxNumber);
                break;
            }
        }
    }
}
