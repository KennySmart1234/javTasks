import java.util.Scanner;

public class TaskTwentyeight{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter side one of the triangle : ");
            int side1Input = userInput.nextInt();

     System.out.print("Enter side two of the triangle : ");
            int side2Input = userInput.nextInt();

     System.out.print("Enter side three of the triangle : ");
            int side3Input = userInput.nextInt();


           int side12 = side1Input + side2Input;
           int side13 = side1Input + side3Input;
           int side23 =side2Input + side3Input;
           
        
        if (side12 > side3Input){
             System.out.print("The input does not form a valid triangle");
                }
         else if (side13 > side2Input){
             System.out.print("The input does not form a valid triangle");
                }

          else if (side23 > side1Input){                
             System.out.print("The input does not form a valid triangle");
                }
        else if ( side1Input == side2Input){
             System.out.print("it is Equilateral");                
                }
                
 
 } 


}
