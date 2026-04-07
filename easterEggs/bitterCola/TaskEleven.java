import java.util.Scanner;


public class TaskEleven{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter speed in Km/h: ");
             int speedInput = userInput.nextInt();

          
                if (speedInput == 0){
                     System.out.print("Stationary\n");
                    }
            else if (speedInput == 1 || speedInput <= 80){
                    System.out.print("Morderate\n");
                     }
            else if (speedInput == 81 || speedInput <= 120){
                    System.out.print("Fast\n");
                     }
            else if (speedInput >= 120){
                    System.out.print("Dangerously Fast\n");               
                    }

    }
}
