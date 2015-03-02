package viktorsarkozi.stringcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author SAVUAAP.PTE
 */
public class StringCalculator {

    private static final String DEFAULT_DELIMETER = ",";
    private String delimeter;

    public StringCalculator() {
        this(DEFAULT_DELIMETER);
    }

    public StringCalculator(String delimeter) {
        this.delimeter = delimeter;
    }

    public int add(String number) throws NegativeNotAllowedException {
        List<Integer> numberList = getNumbers(number);
        validateNumbers(numberList);

        if (number.isEmpty()) {
            return 0;
        }

        int sum = 0;
        String[] numbers = number.split(delimeter);

        for (String digit : numbers) {
            sum += Integer.valueOf(digit);
        }
        return sum;
    }

    public String getDelimeter() {
        return delimeter;
    }

    public void setDelimeter(String delimeter) {
        this.delimeter = delimeter;
    }

    private List<Integer> getNumbers(String number) {
        String[] numbers = number.split(delimeter);
        List<Integer> numberList = new ArrayList<>();
        for (String stringNum : numbers) {
            numberList.add(Integer.valueOf(stringNum));
        }
        return numberList;
    }

    private void validateNumbers(List<Integer> numberList) throws NegativeNotAllowedException {
        List<Integer> negatives = new ArrayList<>();
        for (Integer number : numberList) {
            if (number < 0) {
                negatives.add(number);
            }
        }
        if (!negatives.isEmpty()) {
            throw new NegativeNotAllowedException("Negatívot nem tartalmazhat: "
                    + Arrays.toString(negatives.toArray()));
        }
    }

}
