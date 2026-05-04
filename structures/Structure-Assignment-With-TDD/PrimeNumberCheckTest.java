import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class PrimeNumberCheckTest{

    @Test 
    public void testThatPrimeNumberTwoReturnsTrue(){
    
    int number = 2;
    
    
    boolean expected = PrimeNumberCheck.isPrime(number);
    
    boolean actual = true;
    assertEquals(expected, actual); 
    
    }
    
    @Test 
    public void testThatPrimeNumberOneReturnsFalse(){
    
    int number = 1;
    
    
    boolean expected = PrimeNumberCheck.isPrime(number);
    
    boolean actual = false;
    assertEquals(expected, actual); 
    
    }
    
    @Test 
    public void testThatPrimeNumberSeventeenReturnsTrue(){
    
    int number = 17;
    
    
    boolean expected = PrimeNumberCheck.isPrime(number);
    
    boolean actual = true;
    assertEquals(expected, actual); 
    
    }    

    @Test 
    public void testThatPrimeNumberFourReturnsFalse(){
    
    int number = 4;
    
    
    boolean expected = PrimeNumberCheck.isPrime(number);
    
    boolean actual = false;
    assertEquals(expected, actual); 
    
    }
    
    @Test 
    public void testThatPrimeNumberZeroReturnsFalse(){
    
    int number = 0;
    
    
    boolean expected = PrimeNumberCheck.isPrime(number);
    
    boolean actual = false;
    assertEquals(expected, actual); 
    
    }    
    
    



    }

