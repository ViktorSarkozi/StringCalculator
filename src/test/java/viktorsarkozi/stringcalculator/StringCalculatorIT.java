
package viktorsarkozi.stringcalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAVUAAP.PTE
 */
public class StringCalculatorIT {
    
    private StringCalculator stringCalculator=new StringCalculator();
    
    public StringCalculatorIT() {
    }
    
    @Test
    public void returnZeroIfStringIsEmpty() throws NegativeNotAllowedException{
        assertEquals(0,stringCalculator.add("0"));
    }
    
    @Test
    public void returnNumberIfStringIsOneDigit() throws NegativeNotAllowedException{
        assertEquals(1,stringCalculator.add("1"));
        assertEquals(9,stringCalculator.add("9"));
    }
    
    @Test
    public void returnSumIfStringIsTwoDigit() throws NegativeNotAllowedException{
        assertEquals(10,stringCalculator.add("1,9"));
        assertEquals(6,stringCalculator.add("3,3"));
    }
    
    @Test
    public void returnSumIfStringIsAnyDigit() throws NegativeNotAllowedException{
        assertEquals(18,stringCalculator.add("1,9,8"));
        assertEquals(41,stringCalculator.add("3,3,35"));
    }
    
    @Test
    public void useAnyDelimeterSuccesfully() throws NegativeNotAllowedException{
        StringCalculator s_cal1=new StringCalculator("/t");
        StringCalculator s_cal2=new StringCalculator(";");
        StringCalculator s_cal3=new StringCalculator("/n");
        assertEquals(s_cal1.add("3/t4/t5"),s_cal2.add("3;4;5"));
        assertEquals(s_cal3.add("3/n4/n5"),s_cal1.add("3/t4/t5"));
        assertEquals(s_cal3.add("3/n4/n5"),s_cal2.add("3;4;5"));
    }
    
    @Test(expected = NegativeNotAllowedException.class) 
    public void exceptionIfContainsNegative() throws NegativeNotAllowedException{
        stringCalculator.add("-1,-9");
    }
    
    
}
