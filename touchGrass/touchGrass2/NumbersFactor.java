
import java.util.Scanner;

public class NumbersFactor{
public static void main(String[] agrs){

Scanner inputCollector = new Scanner(System.in);
  System.out.print("Enter a number : ");
  int number = inputCollector.nextInt();



for(int count = 1; count <= number; count++){
    if(number % count == 0){
        System.out.println(count);}
        }
       

    }   

}
