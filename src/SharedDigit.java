public class SharedDigit {

    public static void main (String[]args){
        hasSharedDigit(87,62);
    }

    public static int hasSharedDigit(int number1, int number2){

        if(number1<10 ||number1>99 || number2<10 || number2>99){
            return -1;
        }

        else{
            int x=number1%10;
            int y=number1/10;
            int a = number2%10;
            int b = number2/10;

            if (x==a|| x==b ||y==a||y==b){
                System.out.println("has shared digit");
            }
            else{
                System.out.println("no shared digit");
            }
        }
        return +1;
    }
}
