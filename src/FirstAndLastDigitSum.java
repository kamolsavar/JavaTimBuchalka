import java.util.Scanner;

public class FirstAndLastDigitSum {
     public static int number;

    public static void main(String[]args){
        System.out.println("Enter your number:");
        Scanner scan = new Scanner(System.in);
        number= scan.nextInt();

        sumFirstLastDigit(number);
    }
    public static int sumFirstLastDigit(int number){
        int fDigit=0;
        int lDigit=0;



        if (number<0){
            return -1;
        }
        int sum=fDigit+ lDigit;

        lDigit=number%10;



        while(number>10){
            fDigit=number/10;
            number=number/10;

        }

        sum=fDigit+ lDigit;
        System.out.println(sum);

        return sum;



    }
}
