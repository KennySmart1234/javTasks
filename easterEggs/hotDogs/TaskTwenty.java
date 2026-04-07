import java.util.Scanner;


public class TaskTwenty{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter distance to drive: ");
             int distanceInput = userInput.nextInt();

     System.out.print("Enter fuel efficiency of the car in miles per gallon: ");
             int MpgInput = userInput.nextInt();

     System.out.print("Enter price per gallon: ");
             int ppgInput = userInput.nextInt();

               double distaceMpg = distanceInput / MpgInput;
               double cost = distaceMpg * ppgInput;

           System.out.print("Cost = " + cost + "\n");

  }

}
