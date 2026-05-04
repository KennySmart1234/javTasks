import java.util.Scanner;

public class displayNumbersDecreasingOder{


public static void displaySortedNumbers(double numberOne, double numberTwo, double numberThree){
    

    
    if(numberOne > numberTwo && numberOne > numberThree ){
        System.out.print(numberOne, numberTwo, numberThree);
    }
    if(numberOne < numberTwo && numberTwo < numberThree ){
        System.out.print(numberThree, numberTwo, numberOne);
    }
    if(numberOne > numberTwo && numberTwo < numberThree ){
        System.out.print(numberOne, numberThree, numberTwo);
    }
    if(numberTwo > numberThree && numberOne > numberThree ){
        System.out.print(numberOne, numberTwo, numberThree);
    }

     

}

public static void main(String... args){

    Scanner inputCollector = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    double numberOne = inputCollector.nextInt();
    
    System.out.print("Enter an integer: ");
    double numberTwo = inputCollector.nextInt();
    
    System.out.print("Enter an integer: ");
    double numberThree = inputCollector.nextInt();
    
    displaySortedNumbers(numberOne,numberTwo, numberThree);
        
    
    
    }
    
    
}    
