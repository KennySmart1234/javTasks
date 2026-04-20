
import java.util.Scanner;

public class NumberCompute{
public static void main(String[] agrs){

Scanner inputCollector = new Scanner(System.in);
  System.out.print("Enter a number : ");
  int number = inputCollector.nextInt();







double numberAbove = 1;
double numberBelow = 3;

for (int count = 0; count < number; count++){
       numberAbove = numberAbove + 2;
       numberBelow = numberBelow + 2;
       System.out.println(numberAbove / numberBelow);}


    }   

}
