
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BackToSenderTest {


    @Test
    public void testThatSuccefulDeliveryAmountIsCalculatedCorrectlyForBelow50() {
        //Given
        int number = 49;        

        //When
        int expected = BackToSender.riderWage(number);
        
        //Check
        int actual = 12840;
        assertEquals(actual, expected);    
        }

    @Test
    public void testThatSuccefulDeliveryAmountIsCalculatedCorrectlyFor50To59() {
        //Given
        int number = 50;        

        //When
        int expected = BackToSender.riderWage(number);
        
        //Check
        int actual = 15000;
        assertEquals(actual, expected);    
        }


    @Test
    public void testThatSuccefulDeliveryAmountIsCalculatedCorrectlyFor60To69() {
        //Given
        int number = 60;        

        //When
        int expected = BackToSender.riderWage(number);
        
        //Check
        int actual = 20000;
        assertEquals(actual, expected);    
        }


    @Test
    public void testThatSuccefulDeliveryAmountIsCalculatedCorrectlyForAbove70() {
        //Given
        int number = 80;        

        //When
        int expected = BackToSender.riderWage(number);
        
        //Check
        int actual = 45000;
        assertEquals(actual, expected);    
        }



    }
