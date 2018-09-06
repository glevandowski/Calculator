package presenter;

import javax.swing.*;

public class MainPresenter implements ViewInteractionListener {

    /***
     * manages the dialogs
     */
    @Override
    public String openDialogs(String message, boolean isNumber) {
        try {
            if(isNumber)
                return JOptionPane.showInputDialog(message).replaceAll("^\\D*$","0").trim();
            else
                return JOptionPane.showInputDialog(message).replaceAll("^\\d*$","0").toUpperCase().trim();

        } catch (NumberFormatException ex) {
            return JOptionPane.showInputDialog("check the fields you entered.\n"+message);

        } catch (NullPointerException ex) {

            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Thank you!");
            System.exit(0);
            return "Close Application";
        }
    }

    /***
     * Checks the value of the field you typed.
     */
    @Override
    public String checkResult(double numberOne, double numberTwo, String returnConversion) {
        if(numberOne == 0 || numberTwo == 0)
            return "Check the values ​​you entered, could not be converted.";
        else
            return "Result: " + returnConversion;

    }
}
