public class Sum3And5Challenge {

    public static void main(String[]args){
        int count=0;
        int sum=0;
        for(int i=1; i<=1000; i++){
            if(i%3==0 && i%5==0){
                    count++;
                    sum=sum+i;
                    System.out.println("The numbers are: "+i);
                   }
            if(count==5){
                break;
            }
            }

        System.out.println("The sum of the first five numbers is:"+sum);

        }



}

