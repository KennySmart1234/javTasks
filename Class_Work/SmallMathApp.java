public class SmallMathApp{
static int numberOne = 20;
static int numberTwo = 5;
         
    public static double addition(double numberOne, double numberTwo){             
        return numberOne + numberTwo;}
                    
    public static double subtraction(double numberOne, double numberTwo){                        
        return numberOne - numberTwo;}   
               
    public static double division(double numberOne, double numberTwo){         
        return numberOne / numberTwo;}
             
    public static double multiplication(double numberOne,  double numberTwo){                
        return numberOne * numberTwo;}
             
       
    public static void calculation(String operator){    
        if (operator.equals("+")){
                addition(numberOne, numberTwo);
            } 
        if (operator.equals("-")){
               subtraction(numberOne,numberTwo);
               }  
        if(operator.equals("/")){
                division(numberOne, numberTwo);
            }
        if (operator.equals("*")){
                multiplication(numberOne, numberTwo);
                }
          }  
}

