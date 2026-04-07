import java.util.Scanner;


public class TaskTwentyone{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("Enter values for a: ");
             int inputA = userInput.nextInt();

     System.out.print("Enter values for b: ");
             int inputB = userInput.nextInt();

     System.out.print("Enter values for c: ");
             int inputC = userInput.nextInt();

                int squareB = inputB * inputB;
                int fourAc = 4 * inputA * inputC;
                int sumD = squareB - fourAc;

                    if (sumD > 0){
            double rootD = Math.sqrt(sumD);
            double  bRootD = -inputB + sumD;
                int twoA = 2 * inputA;          
            double root1 = bRootD / twoA;

            double rootD2 = Math.sqrt(sumD);
            double  bRootD2 = -inputB - sumD;
                int twoA2 = 2 * inputA;          
            double root2 = bRootD2 / twoA2;
        System.out.print("root1 = " + root1 + "  root2 = "  + root1 + "\n");         
         }
                else if(sumD == 0){
            int twoA = 2 * inputA;         
            double root1 = -inputB / twoA;
        System.out.print("root = " + root1 + "\n"); 
            }
              else if(sumD < 0){
        System.out.print("The equation has no real root\n"); 
            }            

      }

}
