
import java.util.Scanner;


public class GetKeypadNumber{

public static int getNumber(char uppercaseLetter){

          
switch(uppercaseLetter){

    case 'A','B','C':}
    return 2;
   
//    case 'D','E','F':
//    return 3;    
//        
//    case 'G','H','I':
//    return 4;


//    case 'J','K','L';
//    return 5;
//        break;
//
//    case 'M','N','O';
//    return 6;
//        break;
//
//    case 'P','Q','R','S';
//    return 7;
//        break;
//
//    
//    case 'T','U','V';
//    return 8;
//        break;
//
//    case 'W','X','Y','Z';
//    return 9;
//        break;
    

 
} 



public static void main(String... args){

     Scanner inputCollector = new Scanner(System.in);
     
     System.out.print("Enter a phone number: ");
      char numberString = inputCollector.nextLine().charAt(0);
        numberString = Character.toUpperCase(numberString);


        System.out.print(getNumber(numberString));

    }   

}
