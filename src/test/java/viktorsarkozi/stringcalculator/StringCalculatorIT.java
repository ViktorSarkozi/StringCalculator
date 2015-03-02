/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public void returnZeroIfStringIsEmpty(){
        assertEquals(0,stringCalculator.add("0"));
    }
    
    @Test
    public void returnNumberIfStringIsOneDigit(){
        assertEquals(1,stringCalculator.add("1"));
        assertEquals(9,stringCalculator.add("9"));
    }
    
    @Test
    public void returnSumIfStringIsTwoDigit(){
        assertEquals(10,stringCalculator.add("1,9"));
        assertEquals(6,stringCalculator.add("3,3"));
    }
    
    @Test
    public void returnSumIfStringIsAnyDigit(){
        assertEquals(18,stringCalculator.add("1,9,8"));
        assertEquals(41,stringCalculator.add("3,3,35"));
    }
    
    
}
