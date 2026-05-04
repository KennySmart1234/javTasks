import java.util.Scanner;

public class numberPatternDisplay{


public static void displayPattern(int number){
    

    for(int firstCount = 1; firstCount <= number; firstCount++){
        for(int secondCount =1; secondCount<= firstCount; secondCount++){
                System.out.print(secondCount+ " ");
        
        }
        
        System.out.println();
     }
     

}

public static void main(String... args){

    Scanner inputCollector = new Scanner(System.in);
    
    System.out.print("Enter an integer n: ");
    
    int integer = inputCollector.nextInt();
    
    displayPattern(integer);
        
    
    
    }


}
