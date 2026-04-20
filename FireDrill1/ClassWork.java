import java.util.Scanner;


public class ClassWork{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter a first number: ");
             int numberInput1 = userInput.nextInt();
              int Largest =  numberInput1;

     System.out.print("Enter another number: ");
             int numberInput2 = userInput.nextInt();
                 if (numberInput2 > Largest){
                     Largest = numberInput2;}
                      
     System.out.print("Enter another number: ");
             int numberInput3 = userInput.nextInt();
                if (numberInput3 > Largest){
                  Largest = numberInput3;}

            System.out.println("Largest= " + Largest);

        }
    }
