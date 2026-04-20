public class ReturnMaximumNumber{

public static void main(String[] args){
        maximum(3, 7);
        }

public static int maximum(int numberOne, int numberTwo){
        
            int result = (int)(numberOne - numberTwo);
            if (numberOne > numberTwo){
            System.out.print("The result is " + result + "\n");}
            result = (int)(numberTwo - numberOne);
            if (numberTwo > numberOne){
            System.out.print("The result is " + result + "\n");}
            return result;
            
                         

    }
}
