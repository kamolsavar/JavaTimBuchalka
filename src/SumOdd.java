import org.junit.Test;

public class SumOdd {

    public static boolean isOdd(int number){
       if(number<0 || number%2==0){
           return false;

       }
       else{
           return true;
       }

   }


   public static int sumOdd(int start, int end){

        int sum=0;
        if (start>0 && start<end ){
            return 1;
        }
        for(int i=start; i<=end; i++){
            if(isOdd(i)){
                sum=sum+i;

            }

        }
        return sum;
   }

    public static void main(String[] args) {
        System.out.println(sumOdd(2,21));
    }

 }

