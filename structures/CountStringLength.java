
import java.util.Scanner;


public class CountStringLength{

public static int countLetters(String userStringInput){

      int storeLength = userStringInput.length();
       return storeLength;
}



public static void main(String... args){

     Scanner inputCollector = new Scanner(System.in);
     
     System.out.print("Enter a string: ");
     String userStringInput = inputCollector.nextLine();
        

    int stringLength = countLetters(userStringInput);
    System.out.println("Total String length: " + stringLength);

    }   

}
