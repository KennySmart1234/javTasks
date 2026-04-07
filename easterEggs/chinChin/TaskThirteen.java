import java.util.Scanner;


public class TaskThirteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter an intiger: ");
             int integerInput1 = userInput.nextInt();

     System.out.print("Enter another integer: ");
             int integerInput2 = userInput.nextInt();

              int result1 = integerInput1 / integerInput2;
             
                if (integerInput1 == 0){
                    System.out.println("Error!!! Enter a number above than zero");                    
                    }
                else
            System.out.println(result1);
            
    }

=======
     System.out.print("Enter first month saving: ");
             int firstMonth = userInput.nextInt();

     System.out.print("Enter second month saving: ");
             int secondMonth = userInput.nextInt();

     System.out.print("Enter third month saving: ");
             int thirdMonth = userInput.nextInt();

     System.out.print("Enter fourth month saving: ");
             int fourthMonth = userInput.nextInt();

     System.out.print("Enter fifth month saving: ");
             int fifthMonth = userInput.nextInt();

     System.out.print("Enter sixth month saving: ");
             int sixthMonth = userInput.nextInt();

       
             double savingInterest1 = firstMonth + 0.003125;

             double savingInterest2 = secondMonth + savingInterest1 + 0.003125;
             double savingInterest3 = thirdMonth + savingInterest2 + 0.003125;
             double savingInterest4 = fourthMonth + savingInterest3 + 0.003125;
             double savingInterest5 = fifthMonth + savingInterest4 + 0.003125;
             double savingInterest6 = sixthMonth + savingInterest5 + 0.003125;

          double sum = savingInterest1 + savingInterest2 + savingInterest3 + savingInterest4 + savingInterest5 + savingInterest6; 

           System.out.print("Sum after first six months:" + sum + "\n");

        
    }
>>>>>>> 23f4b40 (Initial commit)
}
