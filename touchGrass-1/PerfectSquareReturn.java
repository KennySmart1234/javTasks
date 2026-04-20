public class PerfectSquareReturn{

public static void main(String[] args){
        perfectSquare(25);
        }

public static int perfectSquare(int number){
           int perfectSquare = 25; 
           int count = 1; 

           int result = (int)(count * count);      
           for (; count <= perfectSquare; count++){
                if (count * count == perfectSquare){
                    System.out.println("true " + perfectSquare + "is a perfect Square");}}

           return result;
                         

    }
}
