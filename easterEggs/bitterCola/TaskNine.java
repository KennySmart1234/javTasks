import java.util.Scanner;


public class TaskNine{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter day: ");
             int dayInput = userInput.nextInt();
     System.out.print("Enter month: ");
             int monthInput = userInput.nextInt();
     System.out.print("Enter year: ");
             int yearInput = userInput.nextInt();

                    int[] thirtyoneMonths = {1,2,5,7,8,10,12}; 
                    int[] thirtyInMonths = {4,6,9,11};


                 if (yearInput >= 0 && yearInput <= 2026 && monthInput == 1 || monthInput <= 12 && dayInput == thirtyoneMonths && dayInput <= 31 ){
                     System.out.print("Valid Date " +"\n");
                    }
                 else if (yearInput >= 0 && yearInput <= 2026 && monthInput == 1 || monthInput <= 12 && dayInput == thirtyInMonths && dayInput <= 30 ){
                     System.out.print("Valid Date " +"\n");
                      }    
                 else if (yearInput >= 0 && yearInput <= 2026 && monthInput == 1 || monthInput <=12 && dayInput == 28 && dayInput <= 29 ){
                     System.out.print("Valid Date " +"\n");
                         }   
                    else 
                        System.out.print("Not Valid Date " +"\n");        

        }
}
