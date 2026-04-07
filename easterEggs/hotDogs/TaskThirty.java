import java.util.Scanner;


public class TaskThirty{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a number of seconds: ");
             int secondsInput = userInput.nextInt();
                int totalMinute = secondsInput / 60;
                int secondsRemining = secondsInput % 60;
                int tatalhours = totalMinute  / 60;


    System.out.print(secondsInput +" seconds = "+ tatalhours + " hours," + totalMinute +" minutes, "+ secondsRemining + "seconds\n");


    }


}
