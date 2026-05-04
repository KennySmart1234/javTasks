
public class LargestNumber{

public static int max(int numberOne, int numberTwo, int numberThree){
        
                int largest = numberOne;
                if(numberTwo > largest){
                    largest = numberTwo;}
                if(numberThree > largest){
                    largest = numberThree;}
     
              
        return largest;

}
public static void main(String... args){

        
        System.out.println(max(1,2,3));
        System.out.println(max(3,2,1));
        System.out.println(max(2,2,2));
        System.out.println(max(-1,-2,-3));


    }   

}
