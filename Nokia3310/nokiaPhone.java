import java.util.Scanner;

public class nokiaPhone{
public static void main(String[] args){



        Scanner userInput = new Scanner(System.in);

while (true){
      System.out.println("          Welcome to Nokia 3310");
      System.out.println("       Enter Menu number to contiune: \n\n"); 



      System.out.println("1 Phonebook\n" + "2 Message\n" + "3 Chart\n" + "4 Call Register\n" + 
                       "5 Tones\n" + "6 Setting\n" + "7 Call Divert\n" + "8 Games\n" + 
                       "9 Calculator\n" + "10 Reminder\n" + "11 Clock\n" + "12 Profile\n" + "13 Sim Services\n");
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
        

                   
if (menuList == 2){

           System.out.println("1 Write Messages\n" + "2 Inbox\n" + "3 Outbox\n" + "4 Picture Messages\n" + "5 Template\n" +
                        "6 Smileys\n" + "7 Message Settings\n" + "8 Info Service\n"+ "9 Voice mailbox number\n" + "10 Service Command Editor\n");}
                     if (menuList == 0){
                     break;}
          System.out.println("       Enter Menu number to contiune: \n\n"); 
          System.out.println("       Enter 0 to go back: ");

             int messageSeven = userInput.nextInt();
            if (messageSeven == 7){
           System.out.println("1 Set 1\n" + "2 Common\n"); 
             if (messageSeven == 0){
                     break;}}

           int setItem = userInput.nextInt();
            if (setItem == 1){
           System.out.println("1 Message center number\n" + "2 Message sent as.\n" + "3 Message Validity.\n"); 
                        }
             if (setItem == 2){        
           System.out.println("1 Delivery reports\n" + "2 Reply via same centre.\n" + "3 Character support.\n");                           
               if (setItem == 0){
                 break;}                  
                }

 
if (menuList == 3){
           System.out.println("1 Chat");
                     if (menuList == 0){
                     break;}
                 }



           
if  (menuList == 4){
           System.out.println("1 Missed calls\n" + "2 Received call\n" + "3 Dialled numbers\n" + "4 Erase recent call list\n" 
                    + "5 Show call duration\n" + "6 show call costs\n" + "7 call cost setting\n" + "8 Prepaid credit\n");
                     if (menuList == 0){
                     break;}
             int callItem = userInput.nextInt();
            if  (callItem == 5){
           System.out.println("1 Last call duration\n" + "2 All calls duration\n" + "3 Received calls' duration\n" + 
                                 "4 Dialled calls' duration\n" + "5 Clear timers\n"); }
                          
            if (callItem == 6){
                System.out.println("1 Last call cost\n" + "2 All calls' cost'\n" + "3 Clear counters.\n"); }
                                       
            if (callItem == 7){               
               System.out.println("1 Call cost limit\n" + "2 Show costs in.\n" + "3 Character support.\n");                           
                        } 

}



if (menuList == 5){
           System.out.println("1 Ringing tone\n" + "2 Rining Volume\n" + "3 Incoming call alert\n" + "4 Composer\n" + "5 Message Alert tone\n" +
                        "6 Kepad tones\n" + "7 Warning and game tone\n" + "8 Vibrating alert\n" + "9 Screen saver\n");
                     if (menuList == 0){
                     break;}
            }




         
if (menuList == 6){
           System.out.println("1 Call setings\n" + "2 Phone settings\n" + "3 Security setting\n" + "4 Restore factory settings\n");
                     if (menuList == 0){
                     break;}
             int settings = userInput.nextInt();
            if  (settings == 1){
           System.out.println("1 Automatic radial\n" + "2 Speed dialling\n" + "3 Call waiting options\n" + 
                                 "4 Phone line in use\n" + "5 Automatic answer\n"); }
                          
            if (settings == 2){
                System.out.println("1 language\n" + "2 Call info display\n" + "3 Welcome note.\n" + "4 Network Selection\n" 
                                    + "5 Lights\n" + "6 Confirm Sim Service action\n"); }
                                       
            if (settings == 3){               
               System.out.println("1 Pin code request\n" + "2 Call barring service\n" + "3 Fixed dialling\n" + "4 Closed user group\n" 
                                   + "5 Phone Security\n" + "6 Change access codes\n");                           
                        } 
                     if (settings == 0){
                     break;}                    

}




if (menuList == 7){
           System.out.println("Call divert");

                 }


if (menuList == 8){
           System.out.println("Game");
                     if (menuList == 0){
                     break;}
                 }


if (menuList == 9){
           System.out.println("Calculator");
                 }


if (menuList == 10){
           System.out.println("Reinder");
                 }


if (menuList == 11){
           System.out.println("1 Alarm clock\n" + "2 Clock settings\n" + "3 Date setting\n" 
                       + "4 Stopwatch\n" + "5 Conterdown timer\n" + "6 Auto update of date and time\n");
                     if (menuList == 0){
                     break;}
                 }

if (menuList == 12){
           System.out.println("Profiles");

                 }
if (menuList == 13){
           System.out.println("Sim Services");

                 }




}
}

}


}




