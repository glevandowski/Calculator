package presenter;

/**
 * @author Gustavo Levandowski
 * @version 1.0
 */
public interface ViewInteractionListener {

    String openDialogs(String message, boolean isNumber);

    String checkResult(double numberOne, double numberTwo, String returnConversion);
}
