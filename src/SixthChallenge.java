public class SixthChallenge {
    public static void main(String[] args) {
        System.out.println(isOdd(24));
        System.out.println(sumOdd(1,11));

    }
    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int startNum, int endNum){
        int sum = 0;

        if (endNum < startNum ||  startNum <= 0 || endNum <= 0 ) {
            return -1;
        }
        for (int i = startNum; i <= endNum; i++){
            boolean isOdd = isOdd(i);
            if (isOdd) {
                sum += i;
            }
        } return sum;
    }
}
