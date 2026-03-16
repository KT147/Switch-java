import java.util.Scanner;

public class UserInputChallengeTwo {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int average = 0;

        while (true){
            String enteredNumber = scanner.nextLine();

            try {
                int number = Integer.parseInt(enteredNumber);
                sum += number;
                count ++;
                average = Math.round((float) sum / count);
            } catch(NumberFormatException nfe) {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }
}
