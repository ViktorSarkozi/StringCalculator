package viktorsarkozi.stringcalculator;

/**
 *
 * @author SAVUAAP.PTE
 */
public class StringCalculator {

    public int add(String number) {
        if (number.isEmpty()) {
            return 0;
        }
        
        int sum=0;
        String[] numbers = number.split(",");
        
        for (String digit : numbers) {
            sum+=Integer.valueOf(digit);
        }
        return sum;
    }
}
