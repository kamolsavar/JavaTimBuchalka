public class SameLastDigit {

    public static void main(String[]args){
        hasSameDigit(123, 235, 21);
    }
    public static int hasSameDigit(int number1, int number2, int number3){
        if(number1<10||number1>1000||number2<10||number2>1000||number3<10||number3>10000){
            return -1;
        }

        else{
            int a=number1%10;
            int b=number2%10;
            int c=number3%10;
            if(a==b||a==c||b==c){
                System.out.println("Has shared number");
            }
            else{
                System.out.println("Has no shared number");
            }
        }
    return +1;
    }
}
