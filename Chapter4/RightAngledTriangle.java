import java.util.Scanner;

public class RightAngledTriangle{
    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("enter the length of the base of a triangle ");
        int numberOfRows = inputCollector.nextInt();

        for(int rowCounter = 1; rowCounter <= numberOfRows; rowCounter++){

            for(int starCounter = 1; starCounter <= rowCounter; starCounter++){
            
                System.out.print("*");         
            
            }
            
            System.out.println();

        }

    }

}
