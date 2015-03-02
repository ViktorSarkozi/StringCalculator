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
        String[] numbers = number.split(",");
        if (numbers.length == 1) {
            return Integer.valueOf(numbers[0]);
        }
        return Integer.valueOf(numbers[0]) + Integer.valueOf(numbers[1]);
    }
}
