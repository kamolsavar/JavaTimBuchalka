public class GreatestCommonDivisor {

    public static void main(String args[]) {
        getGreatestCommonDivisor(40, 60);

    }

    public static int getGreatestCommonDivisor(int number1, int number2) {


        if (number1 < 10 || number2 < 10) {
            return -1;
        } else {
            if (number1 > number2) {
                for (int i = number2; i >= 1; i--) {
                    if ((number1 % i == 0) && (number2 % i == 0)) {


                        System.out.println(i);
                    }
                }

            }
            else{
                int count=0;
                for(int j=number1; j>=1; j--){
                    if(number1%j==0 && number2%j==0){
                        System.out.println(j);
                        count=1;
                        break;
                    }
                }
            }
            return 1;
        }
    }

}