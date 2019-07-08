public class ElseDayOfTheWeek {

    public static void main(String[] args) {
    printTheDayOfWeek(2);
    }

    public static void printTheDayOfWeek(int day){
        if (day==1) {
            System.out.println("It is sunday");
        }
        else if(day==2){
            System.out.println("It is Monday");
         }
        else if(day==3){
            System.out.println("It is Tuesday");
        }
        else if (day==3){
            System.out.println("It is Wednesday");
        }
        else if (day==4){
            System.out.println("It is Thursday");
        }
        else if (day==5){
            System.out.println("Is is Friday");
        }
        else {
            System.out.println("It is an invalid day");
        }
    }
}
