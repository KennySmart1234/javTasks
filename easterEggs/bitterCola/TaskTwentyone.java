import java.util.Scanner;


public class TaskTwentyone{
public static void main(String[] agrs){


         Scanner userInput = new Scanner(System.in);
     System.out.print("1 for water:   ");
     System.out.print("2 for JUice:   ");
     System.out.print("3 for Soda:    ");
     System.out.print("4 for Snack:   ");
          int water = userInput.nextInt();
          int juice = userInput.nextInt();

//          int soda = userInput.nextInt();
//          int snack = userInput.nextInt(); 



     System.out.print("Enter amount to render: ");

/////////  WATER 
          int amountTendered1 = userInput.nextInt();
           int amountTendered2 = userInput.nextInt();  
             int WaterChange = amountTendered1 - 100;
             int juiceChange = amountTendered2 - 200;


     if (water == 1){
         if  (amountTendered1 >= 100){ 
                 System.out.println("Sufficient Amount\n"+ "Water Change = " + WaterChange);            
                     }
             else 
                System.out.print("Insufficient Amount");
                }


//// JUICE
//           int juice = userInput.nextInt();
//             int juiceChange = amountTendered - 200;

     if (juice == 2){
         if (amountTendered2 >= 200){ 
                 System.out.println("Sufficient Amount\n"+ "juice Change = " + juiceChange);            
                     }
             else 
                System.out.print("Insufficient Amount");
                }



// SODA
//          int amountTendered = userInput.nextInt(); 
//             int sodaChange = amountTendered - 150;
//
//     if (soda == 3){
//            if (amountTendered >= 150){ 
//                  System.out.print("Sufficient Amount"+ "soda Change = " + sodaChange);            
//             }
//            else 
//                System.out.print("Insufficient Amount");
//            }
//

 

//// SNACK
//          int amountTendered = userInput.nextInt(); 
//             int snackChange = amountTendered - 150;
//           
//     if (snak == 4){
//        if (amountTendered >= 300){ 
//            System.out.print("Sufficient Amount"+ "snack Change = " + snackChange);            
//               }
//            else 
//            System.out.print("Insufficient Amount");
//            }

                    
    }
}
