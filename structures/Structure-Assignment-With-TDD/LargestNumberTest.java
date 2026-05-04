import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class LargestNumberTest{

    @Test 
    public void testThatLargestNumberOfThreeIntegerReturns3(){
    
    int numberOne = 1;
    int numberTwo = 2;
    int numberThree = 3;
    
    
    int expected = LargestNumber.max(numberOne, numberTwo, numberThree);
    
    int actual = 3;
    assertEquals(expected, actual); 
    
    }

    @Test 
    public void testThatLargestNumberOfThreeDigitReturns3(){
    
    int numberOne = 3;
    int numberTwo = 2;
    int numberThree = 1;
    
    
    int expected = LargestNumber.max(numberOne, numberTwo, numberThree);
    
    int actual = 3;
    assertEquals(expected, actual); 
    
    }    

    @Test 
    public void testThatLargestNumberOfThreeIntegerReturns2(){
    
    int numberOne = 2;
    int numberTwo = 2;
    int numberThree = 2;
    
    
    int expected = LargestNumber.max(numberOne, numberTwo, numberThree);
    
    int actual = 2;
    assertEquals(expected, actual); 
    
    }
    
    
    @Test 
    public void testThatLargestNumberOfThreeIntegerReturnsMinuOne(){
    
    int numberOne = -1;
    int numberTwo = -2;
    int numberThree = -3;
    
    
    int expected = LargestNumber.max(numberOne, numberTwo, numberThree);
    
    int actual = -1;
    assertEquals(expected, actual); 
    
    }



    }

