import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class SumAllOfDigitTest{

    @Test 
    public void testThatSumOfDigitIsEqualTo6(){
    
    int number = 123;

    
    
    int expected = SumAllOfDigit.sumOfDigit(number);
    
    int actual = 6;
    assertEquals(expected, actual); 
    
    }

    @Test 
    public void testThatSumOfDigitIsEqualTo0(){
    
    int number = 0;


    
    int expected = SumAllOfDigit.sumOfDigit(number);
    
    int actual = 0;
    assertEquals(expected, actual); 
    
    }    

    @Test 
    public void testThatSumOfDigitIsEqualTo27(){
    
    int number = 999;
    
    
    int expected = SumAllOfDigit.sumOfDigit(number);
    
    int actual = 27;
    assertEquals(expected, actual); 
    
    }
    
    
    @Test 
    public void testThatSumOfDigitIsEqualTo1(){
    
    int number = 1000;
    
    
    int expected = SumAllOfDigit.sumOfDigit(number);
    
    int actual = 1;
    assertEquals(expected, actual); 
    
    }



    }

