public class DayOfTheWeek {
    public static void main(String[]args){

        DayOfTheWeek dayOfTheWeek= new DayOfTheWeek();
        dayOfTheWeek.printTheDayOfTheWeek(2);
    }

    public void printTheDayOfTheWeek(int day){

        switch(day){
            case 1:
                System.out.println("It is sunday");
                break;
            case 2:
                System.out.println("It is Monday");
                break;
            case 3:
                System.out.println("It is Tuesday");
            case 4:
                System.out.println("It is wednesday");
                break;
            case 5:
                System.out.println("It is Thursday");
                break;
            case 6:
                System.out.println("It is Friday");
                break;
            case 7:
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }

}
