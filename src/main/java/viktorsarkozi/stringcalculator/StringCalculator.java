package viktorsarkozi.stringcalculator;

/**
 *
 * @author SAVUAAP.PTE
 */
public class StringCalculator {
    
    public int add(String number){
        if(number.isEmpty()){
            return 0;
        }
        return Integer.valueOf(number);
    }
}
