public class PractiseFifteen {
    public static void main(String[] args) {
        System.out.print(isPerfectNumber(4));
    }
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number < 1){
            return false;
        } else {
            for (int i = 1; i < number; i++){
                if (number % i == 0) {
                    sum += i;
                    if (sum == number) {
                        return true;
                    }
                }
            }

        } return false;
    }
}
