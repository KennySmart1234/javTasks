//write a function that takes in 3 number and return the height of the number

import java.util.Scanner;

public class FunctionWithLargestNumber{

    public static int largestNumber(int number){
        int largest = 0;
   
       
        if (number > largest){
            largest = number; }
            return largest;  
    
    }
    
public static void main(String... args){
    Scanner inputCollector = new Scanner(System.in);
   
    System.out.print("Enter a number: ");
    int number = inputCollector.nextInt(); 
    while(number != -1)
    System.out.print("Enter a number: ");
    int number = inputCollector.nextInt(); 





    System.out.print(largestNumber(number));        
    



    }
}













 
