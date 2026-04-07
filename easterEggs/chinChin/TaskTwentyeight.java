import java.util.Scanner;

<<<<<<< HEAD

=======
>>>>>>> 23f4b40 (Initial commit)
public class TaskTwentyeight{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
     System.out.print("Enter a month from 1 to 12: ");
             int monthInput = userInput.nextInt();

          if (monthInput <= 0){
                System.out.println("Value outside this range");
                }
          else if (monthInput == 1){
                System.out.println("January");
                }
           else if (monthInput == 2){
                System.out.println("February");
                }
           else if (monthInput == 3){
                System.out.println("March");
                }
           else if (monthInput == 4){
                System.out.println("April");
                }
           else if (monthInput == 5){
                System.out.println("May");
                }
           else if (monthInput == 6){
                System.out.println("June");
                }
           else if (monthInput == 7){
                System.out.println("July");
                }
           else if (monthInput == 8){
                System.out.println("August");
                }
           else if (monthInput == 9){
                System.out.println("September");
                }
           else if (monthInput == 10){
                System.out.println("October");
                }
           else if (monthInput == 11){
                System.out.println("November");
                }
           else if (monthInput == 12){
                System.out.println("December");
                }
           else if (monthInput > 12){
                System.out.println("Value outside this range");
                }

        }
    }

=======
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
>>>>>>> 23f4b40 (Initial commit)
