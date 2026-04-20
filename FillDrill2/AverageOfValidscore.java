import java.util.Scanner;
public class ValidScores{
public static void main(String[] agrs){


Scanner inputCollector = new Scanner(System.in);


int sum = 0;
for(int counter = 1; counter <= 10; counter++){

    System.out.print(counter + " Enter Score: ");
    int score = inputCollector.nextInt();

    if (score >= 0 && score <= 100){
             sum = sum + score;}        
            
    
    System.out.println("Sum = " + sum);
    }
}

}
