import java.util.Scanner;


public class PasswordValidityCheck{

public static boolean isValidPassword(String password){

        int passwordLength = password.length();
        if(passwordLength >= 10){
        
            for(int passwordLengthCount = 0; passwordLengthCount<=password.length(); passwordLengthCount++){
            
            
             }System.out.println("Valid Password");

             return true;
                }
        else{
            System.out.println("Invalid Password");
        return false;
        
    }
  
}
public static void main(String... args){

     Scanner inputCollector = new Scanner(System.in);
     
     System.out.print("Enter your password: ");
     String password = inputCollector.nextLine();
        

    boolean validPassword = isValidPassword(password);
    System.out.println(validPassword);

    }   

}
