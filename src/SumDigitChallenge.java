public class SumDigitChallenge {

    public static void main(String[]args){
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(25));
        System.out.println(sumDigits(120));
        System.out.println(sumDigits(9));

    }

    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }

        int digit=0;
        int sum=0;
        while(number>0){
         digit =number%10;
         sum=sum+digit;
         number=number/10;
        }

        return sum;

    }
}
