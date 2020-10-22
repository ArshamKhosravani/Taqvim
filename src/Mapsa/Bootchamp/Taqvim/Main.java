package Mapsa.Bootchamp.Taqvim;
import java.util.Scanner;

public class Main {

    public static int ValueOfDay(String s){

        int Value;
        switch(s){
            case "Monday":
                Value=0;
                break;
            case "Tuesday":
                Value=1;
                break;
            case "Wednesday":
                Value=2;
                break;
            case "Thursday":
                Value=3;
                break;
            case "Friday":
                Value=4;
                break;
            case "Saturday":
                Value=5;
                break;
            case "Sunday":
                Value=6;
                break;
            default:
                Value=-1;//I will fix this part with an exception or printing a message
                break;
        }

        return Value;
    }

    public static int CalCulateDays(Year y){//Calculate days past from the first day of year
        int NumberOfDays=0;

        if(y.getOurMonth()<=6){
            NumberOfDays=(y.getOurMonth()-1)*31 +y.getOurDay();
        }else if(y.getOurMonth()>6&&y.getOurMonth()<11){
            NumberOfDays=6*31 + (y.getOurMonth()-7)*30 + y.getOurDay();
        }else if(y.getOurMonth()==12){
            NumberOfDays=6*31 + 5*30 + y.getOurDay();
        }
                return NumberOfDays;
    }

    public static int CalculateWichDay(Year y1,Year y2,String day){

        int temp=0;
        int FirstYearDays=CalCulateDays(y1);
        int SecondYearDays=CalCulateDays(y2);
        int WichDay=ValueOfDay(day);

        if(FirstYearDays<SecondYearDays){
            temp=FirstYearDays;
            FirstYearDays=SecondYearDays;
            SecondYearDays=temp;
        }

        return ((FirstYearDays-SecondYearDays+WichDay)%7);
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Insert month:");
        int FirstMonth=input.nextInt();
        System.out.println("Insert day:");
        int FirstDay=input.nextInt();

        Year FirstYear=new Year(FirstMonth,FirstDay);

        System.out.println("Insert day of week: ");
        String DayOfWeek=input.next();

        System.out.println("Insert the month that you want:");
        int SecondMonth=input.nextInt();

        System.out.println("Insert the day that you want");
        int SecondDay=input.nextInt();

        Year SecondYear=new Year(SecondMonth,SecondDay);

        int WichDay=CalculateWichDay(FirstYear,SecondYear,DayOfWeek);

            System.out.println("************************************************************");
            System.out.println("In that day  the day of the week is:");

            switch(WichDay){
                case 0:
                    System.out.println("Monday");
                    break;
                case 1:
                    System.out.println("Tuesday");
                    break;
                case 2:
                    System.out.println("Wednesday");
                    break;
                case 3:
                    System.out.println("Thursday");
                    break;
                case 4:
                    System.out.println("Friday");
                    break;
                case 5:
                    System.out.println("Saturday");
                    break;
                case 6:
                    System.out.println("Sunday");
                    break;
            }

    }
}
