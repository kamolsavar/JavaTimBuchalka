public class NumberToWords {

    public static void main(String ags[]){
    getNumberToWords(375);
    }



    public static int getNumberToWords(int number){
        if(number<0){
            System.out.println("invalid value");
        }

        else{
            int count=0;
            int reverseNum=0;
            while(number>0){
                int remainder=number%10;
                reverseNum=reverseNum*10+remainder;
                number=number/10;
                count++;
                System.out.println(count);

            }
            while(reverseNum>0){
                int remainder1=reverseNum%10;
                reverseNum=reverseNum/10;
                int i=remainder1;
                switch(i){
                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
            }

        }
        return -1;
    }
}
