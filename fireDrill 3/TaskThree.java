import java.util.Scanner;
public class TaskThree{

public static void main(String... agrs){

Scanner inputCollector = new Scanner(System.in);

    int total =11;
int [] number = new int[total];
    
    for(int count = 0; count<= total; count++){
        if(count == 10){break;}
     System.out.print("Enter the score: ");
     
        number[count] = inputCollector.nextInt();}
        System.out.println();
    
    for(int printCount = 0; printCount <= number.length; printCount++){
        if(printCount == 10) {break;}
        int scores = (number[printCount]);
        System.out.print(scores+" ");
        
    }
    
    }
     

}
