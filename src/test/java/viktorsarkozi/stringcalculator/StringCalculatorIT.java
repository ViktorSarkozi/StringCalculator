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
    
    
}
