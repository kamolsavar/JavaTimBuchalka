public class perfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        } else {
            for (int i = 1; i < number; i++) {
                int sum=0;
                if (number % i == 0) {
                    sum= i + 1;
                    if (sum == number) {
                        return true;
                    } else return false;
                }
            }
            return false;

        }
    }
}
