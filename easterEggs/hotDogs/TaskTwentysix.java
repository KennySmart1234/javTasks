import java.util.Scanner;


public class TaskTwentysix{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a year: ");
             int yearInput = userInput.nextInt();

               int yearDivision1 = yearInput / 4;
               double yearDivision2 = yearInput % 400;
               double yearRemainder3 = yearInput % 100;



                if (yearDivision1 > 0){
                 System.out.print("it's a leap year" + "\n");
                        }
                   else if (yearDivision2 != 0){
                 System.out.print("Not a leap year" + "\n");
                        }
                   else if (yearRemainder3 == 0){
                 System.out.print("it's a leap year" + "\n");
                        }
                    else
                 System.out.print("Not a leap year" + "\n");
            

  }

}
