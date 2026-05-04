public class pentagonalNumber{

    public static int getPentagnalNumber(int n){
        return n*(3*n-1)/2;
    
    
    
    }

public static void main(String... args){
    int result = getPentagnalNumber(3);
    System.out.println("nth pentagonal number: "+ result);
    int count = 1;
    for(; count <=100; count++){ 
            int pentagonalNumberResult = count*(3*count-1)/2;
 
              
        System.out.printf("%7d", pentagonalNumberResult);
        
         if(count % 10 == 0){
            System.out.println();}



            }
        }


}





















