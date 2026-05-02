import java.util.Scanner;
import java.time.LocalDate;

public class menstrualAppCalculculator{

    public static String nextPeriodDate(String lastPeriodDate, int cycleLength){
        LocalDate lastPeriod = LocalDate.parse(lastPeriodDate);
        LocalDate nextPeriod = lastPeriod.plusDays(cycleLength);
        return nextPeriod.toString();
    }

//    pulic static int safePeriods(){
//    
//    }

      public static int ovulationDays( int cycleLength){
        return cycleLength - 14;
    }
    

public static void main(String... args){
    Scanner inputCollector = new Scanner(System.in);     

    System.out.print("Enter your mentrual cycle length ");
    int cycleLength = inputCollector.nextInt();
    inputCollector.nextLine();
    
    System.out.print("Enter your last period date(Year-Month-Date) ");
    String lastPeriodDate = inputCollector.nextLine();

    String YourNextPeriodDate = nextPeriodDate(lastPeriodDate, cycleLength);

    System.out.print("Your next period start date is: "+ YourNextPeriodDate);
    System.out.println("Ovulation day: "+ovulationDays(cycleLength));
    
    
}


}
