import java.util.Scanner;

public class nokiaPhone{
public static void main(String[] args){



        Scanner userInput = new Scanner(System.in);

while (true){
      System.out.println("          Welcome to Nokia 3310");
      System.out.println("       Enter Menu number to contiune: \n\n"); 



      System.out.println("1 Phonebook\n" + "2 Message\n" + "3 Chart\n" + "4 Call Register\n" + 
                       "5 Tones\n" + "6 Setting\n" + "7 Call Divert\n" + "8 Games\n" + 
                       "9 Calculator\n" + "10 Reminder\n" + "11 Clock\n" + "12 Profile\n" + "13 Sim Services\n ");
          int menuList = userInput.nextInt();
             
    
while (true){
if (menuList == 1){

           System.out.println("1 Search\n" + "2 Service Nos.\n" + "3 Add name\n" + "4 Erase\n" + 
                       "5 Edit\n" + "6 Assign Tone\n" + "7 Send b'card\n" + "8 Options\n"+ "9 Speed Dials\n" + "10 Voice Tags\n");
            if (menuList == 0){
                  break;  }

      System.out.println("       Enter Menu number to contiune: \n\n"); 
          System.out.println("       Enter 0 to go back: ");

             int optionEight = userInput.nextInt();
            if (optionEight == 8){
           System.out.println("1 Type of View\n" + "2 Memory Status.\n"); }            
            if (optionEight == 0){
                  break; }         
                }
   }
}
}
}
}    

                   



           






