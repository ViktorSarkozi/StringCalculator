package viktorsarkozi.stringcalculator;

/**
 *
 * @author SAVUAAP.PTE
 */
public class StringCalculator {

    private static final String DEFAULT_DELIMETER=",";
    private String delimeter;

    public StringCalculator() {
        this(DEFAULT_DELIMETER);
    }
    
    public StringCalculator(String delimeter) {
        this.delimeter=delimeter;
    }
    
    public int add(String number) {
        if (number.isEmpty()) {
            return 0;
        }
        
        int sum=0;
        String[] numbers = number.split(delimeter);
        
        for (String digit : numbers) {
            sum+=Integer.valueOf(digit);
        }
        return sum;
    }

    public String getDelimeter() {
        return delimeter;
    }

    public void setDelimeter(String delimeter) {
        this.delimeter = delimeter;
    }
    
    
}
