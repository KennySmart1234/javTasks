//write a function that takes in 3 number and return the height of the number

import java.util.Scanner;

public class FunctionWithLargestNumber{

    public static int largestNumber(int one, int two, int three){
        int largest = one;
   
       
        if (two > largest){
            largest = two; }

       if (three > largest){
            largest = three; }
            return largest;  
    
    }
    
public static void main(String... args){
    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int numberOne = inputCollector.nextInt();

    System.out.print("Enter a number: ");
    int numberTwo = inputCollector.nextInt();

    System.out.print("Enter a number: ");
    int numberThree = inputCollector.nextInt();





    System.out.print(largestNumber(numberOne,numberTwo,numberThree));        
    



    }
}













 
