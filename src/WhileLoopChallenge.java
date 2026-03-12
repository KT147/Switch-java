public class WhileLoopChallenge {
    public static void main(String[] args) {
//        System.out.println(isEvenNumber(9));
        int number = 4;
        int evenNumberCount = 0;
        int oddNumberCount = 0;

        while (number <= 20){
            number ++;
            if (!isEvenNumber(number)) {
                oddNumberCount ++;
                continue;
            }
                System.out.println(number);
                evenNumberCount ++;
                if (evenNumberCount >= 5) {
                    break;
                }
        }
        System.out.println("Total number of even numbers " + evenNumberCount);
        System.out.println("Total number of odd numbers " + oddNumberCount);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2 ) == 0) {
            return true;
        }
        return false;
    }
}
