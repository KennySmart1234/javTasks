import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestMenstrualAppCalculculator {

    @Test
    public void testToCalculateNextMenstrualPeriodStartDatefor28DayCircleLength(){
    
//    Given
    String lastPeriodDate = "2026-04-23";
    
//    When
    int cycleLength = 28;
    String expected = menstrualAppCalculculator.nextPeriodDate(lastPeriodDate, cycleLength);
    
//    Check
    String actual = "2026-05-21";
    assertEquals(actual, expected);
    
    }
    
    
    
    @Test
    public void testToCalculateOvulationStartDateBeforeMentrualPeriod(){
    
    
//    Given
    int cycleLenght = 32;
    
    int expected = menstrualAppCalculculator.ovulationDays(cycleLenght);
    
    
    int actual = 18;
    assertEquals(actual, expected);


    }
    

}






