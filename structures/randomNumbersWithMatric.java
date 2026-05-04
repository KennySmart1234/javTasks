import java.util.Scanner;
import java.util.Random;


public class randomNumbersWithMatric{

public static void printMatrix(int number){

       Random randonInputCollector = new Random();
       for(int firstCount = 0; firstCount <= number; firstCount++){
            for(int secondCount = 0; secondCount <= number; secondCount++){
                int randonNumberGenerated = randonInputCollector.nextInt(2);
            
            System.out.print(randonNumberGenerated+ " ");}

       System.out.println();      
       
       }
  
    }
  

public static void main(String... args){

     Scanner inputCollector = new Scanner(System.in);
     
     System.out.print("Enter a number ");
     int number = inputCollector.nextInt();
        

    printMatrix(number);

    }   

}
