import java.util.Scanner;


public class TaskTwenty{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter a any four digit number: ");
             int digitInput = userInput.nextInt();
               int divisionDigit1 = digitInput % 10;
               int divisionDigit11 = digitInput / 10;
            

                int divisionDigit2 = divisionDigit11 % 10;
                int divisionResult22 = divisionDigit11 / 10;
     

                int divisionDigit3 = divisionResult22 % 10;
                int divisionResult33 = divisionResult22 / 10;

                int divisionDigit4 = divisionResult33 % 10;
                int divisionDigit44 = divisionResult33 / 10;
               


    System.out.print(divisionDigit1 +""+ divisionDigit2 + ""+ divisionDigit3 + "" + divisionDigit4 + "\n");


}
=======
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
>>>>>>> 23f4b40 (Initial commit)

}
