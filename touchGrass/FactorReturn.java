public class FactorReturn{

public static void main(String[] args){
        quotient(10);
        }

public static int quotient(int number){
           int quotient = 50; 
           int count = 1; 
//           int total_count = 0;
           int result = (int)(quotient % count);      
           for (; count <= quotient; count++){
                if (quotient % count == 0){
                    System.out.print(count + " ");}}
//                    total_count = count + 1;
//           System.out.print(total_count);
           return result;
                         

    }
}
