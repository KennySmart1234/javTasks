import java.util.Random;


public class Generate{
public static void main(String[] args){


         Random numberGen  = new Random();
             int  suggestNum1 = numberGen.nextInt(1, 100);
             int  suggestNum2 = numberGen.nextInt(1, 100);
             int  suggestNum3 = numberGen.nextInt(1, 100);
             int  suggestNum4 = numberGen.nextInt(1, 100);                
                System.out.println(suggestNum1);    
                System.out.println(suggestNum2); 
                System.out.println(suggestNum3); 
                System.out.println(suggestNum4); 
}

}
