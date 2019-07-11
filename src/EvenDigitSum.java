public class EvenDigitSum {

    public static void main(String[]args){
        getEvenDigitSum(481);
    }

    public static int getEvenDigitSum(int number){
        int num=number;
        int sum=0;
        int digitEven=0;
        if (number<0){
            return -1;}
        while(num>0){

            if(num%2==0){
                digitEven=num%10;
                sum=sum+digitEven;
                System.out.println(sum);
            }

            num=num/10;

        }

        return sum;

    }

}
