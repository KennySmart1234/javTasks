import java.util.Scanner;

public class polindromeNumberReverse{


public static void reverse(int number){
    

    for(int count = number; count > 0; count = count/10){
        int extract = number % 10;    
        System.out.print(extract);
        number = number/10;
     }
//     return extract;
     

}

public static void main(String... args){

    Scanner inputCollector = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    
    int integer = inputCollector.nextInt();
    
    reverse(integer);
        
    
    
    }



}
