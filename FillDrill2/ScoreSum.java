import java.util.Scanner;
public class ScoreSum{
public static void main(String[] agrs){


Scanner inputCollector = new Scanner(System.in);
//System.out.print("Enter Score: ");


int sum = 0;
for(int counter = 1; counter <= 30; counter++){

System.out.print(counter + " Enter Score: ");
int score = inputCollector.nextInt();

sum = sum + score;

}
System.out.println("Sum = " + sum);
}




}
























