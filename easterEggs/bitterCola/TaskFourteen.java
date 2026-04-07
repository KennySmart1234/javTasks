import java.util.Scanner;


public class TaskFourteen{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter dollars from range 1 - 10: ");
             int dollarsInput = userInput.nextInt();

          
                if (dollarsInput == 1){
                     System.out.print("1$ - One dollar\n");
                    }
            else if (dollarsInput == 2){
                    System.out.print("$2 - two dollars\n");
                     }
            else if (dollarsInput == 3){
                    System.out.print("$3 - three dollars\n");
                     }
            else if (dollarsInput == 4){
                    System.out.print("$4 four dollars\n");               
                    }
            else if (dollarsInput == 5){
                    System.out.print("$5 five dollars\n");               
                    }
            else  if (dollarsInput == 6){
                     System.out.print("6$ six dollar\n");
                    }
            else if (dollarsInput == 7){
                    System.out.print("$7 seven dollars\n");
                     }
            else if (dollarsInput == 8){
                    System.out.print("$8 eight dollars\n");
                     }
            else if (dollarsInput == 9){
                    System.out.print("$9 nine dollars\n");               
                    }
            else if (dollarsInput == 10){
                    System.out.print("$10 ten dollars\n"); 
                    }
                    else
                    System.out.print("out of range\n"); 

    }
}
