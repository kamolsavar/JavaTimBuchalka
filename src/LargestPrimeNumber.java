public class LargestPrimeNumber {
    public static void main(String args[]) {
        getLargestPrimeNumber(52);
    }

    public static int getLargestPrimeNumber(int number) {
        boolean isPrimeNumber = true;
        int count = 0;
        int primeFactor = 0;
        if (number < 0) {
            return -1;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isPrimeNumber = false;
                            count++;
                        }

                    }
                    if (count == 1) {
                        if (primeFactor < i) {
                            isPrimeNumber = true;
                            primeFactor=i;
                        }
                    }


                }



            }


        }
        return -1;
    }
}