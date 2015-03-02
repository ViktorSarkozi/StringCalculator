
package viktorsarkozi.stringcalculator;

/**
 *
 * @author SAVUAAP.PTE
 */
public class NegativeNotAllowedException extends Exception {

    /**
     * Creates a new instance of <code>NegativeNotAllowed</code> without detail
     * message.
     */
    public NegativeNotAllowedException() {
    }

    /**
     * Constructs an instance of <code>NegativeNotAllowed</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NegativeNotAllowedException(String msg) {
        super(msg);
    }
}
