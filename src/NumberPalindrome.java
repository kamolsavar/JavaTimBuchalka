public class NumberPalindrome {
    public static void main(String[]args){
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindrome(int number){

       int reminder=0;
       int reverse =0;
       int num=number;

        while(num>0){
            reminder=num%10;
            reverse=reverse*10+reminder;
            num=num/10;

       }

        if (reverse ==number){
            System.out.println("The number is palindrone");
            System.out.println(reverse);
            return true;
        }
        else

            return false;



    }
}
