import java.util.Scanner;

public class SumN{
public static void main(String... agrs){



      System.out.print("Enter letter N  = ");
        Scanner input =  new Scanner(System.in);
          String letter = input.nextLine();

      int N = 1;
        while (N <= 14){
            System.out.printf("%s%d%s%d%n", "N Sum",N, "= ", N+N);
            N++;
     }
           


  }




}
