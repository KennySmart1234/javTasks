import java.util.Scanner;


public class TaskTwenty{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter grade from A - F: ");
             String gradeInput = userInput.nextString();
     


              Switch(gradeInput)
              case A
                     System.out.print("4.0\n");
              case B
                     System.out.print("3.0\n");
              case C
                     System.out.print("2.0\n");
              case D
                     System.out.print("1.0\n");
              case F
                     System.out.print("0.0\n");
                    
    }
}
