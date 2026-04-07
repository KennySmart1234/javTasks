import java.util.Scanner;


public class TaskEight{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a number of minutes: ");
             int minutesInput = userInput.nextInt();
               int daysSum = minutesInput / 1440;
               int minutesRemining = minutesInput % 1440;
               int yearsSum = daysSum / 365;
               int daysRemaining = daysSum % 365;
               int minuteLeft = minutesRemining / 60;
                
    System.out.print(yearsSum +" years  "+ daysRemaining +" days "+ minuteLeft + "minute\n");


    }


}
