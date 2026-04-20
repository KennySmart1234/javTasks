public class QuotientReturn{

public static void main(String[] args){
        quotient(100, 5);
        }

public static int quotient(int numberOne, int numberTwo){
        
            int result = (int)(numberOne % numberTwo);
            System.out.print("The result is " + result + "\n");
            if (numberTwo == 0){
            System.out.print("Second integer is " + numberTwo + "\n");}
            return result;
                         

    }
}
