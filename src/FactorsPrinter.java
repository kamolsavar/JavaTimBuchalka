public class FactorsPrinter {


    public static void main(String[]args){
            getFactors(-22);
    }

    public static int getFactors(int number){
        int factors=1;
        if(number<1){
            return -1;
        }
        else{
            for(int i=1; i<=number; i++){
                if(number%i==0){
                    System.out.println(i);
                }
            }
        }
        return factors;
    }
}


