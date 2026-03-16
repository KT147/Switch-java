import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        System.out.println(getInputFromScanner());
    }

    public static double getInputFromScanner() {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;
        while (counter <= 5) {
            System.out.println("Enter number #" + counter);
            String nextNumber = scanner.nextLine();
            try {
                double userInputInInt = Double.parseDouble(nextNumber);
                counter ++;
                sum += userInputInInt;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid value");
            }
        }


        return sum;
    }

}
