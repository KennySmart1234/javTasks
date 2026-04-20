public class ReturnTrueOrFalse{

public static void main(String[] args){
        maximum(5.23, 20);
        }

public static int maximum(double numberOne, double numberTwo){
        int result = (int)(numberOne * numberTwo);

        if (result % 2 == 0){
            System.out.print(true);}
        else
            System.out.print(false);
        return result;
    }


}

