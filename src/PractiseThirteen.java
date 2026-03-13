public class PractiseThirteen {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int greatestDivisor = 1;
        if (first < 10 || second < 10) {
            return -1;
        } else {
            for (int i = 1; i <= Math.min(first, second); i++) {
                if (first % i == 0 && second % i == 0) {
                    greatestDivisor = i;
                }
            }
        }
        return greatestDivisor;
    }
}
