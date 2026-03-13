public class PractiseTwelve {
    public static void main(String[] args) {
        printFactors(32);
    }
    public static void printFactors(int number){
        String text = "";
        if (number < 1) {
            text ="Invalid Value";
        } else {
            for (int i = 1; i <= number; i++ ) {
                if (number % i == 0) {
                    text += i + " ";
                }
            }
        }
        System.out.println(text);
    }
}
