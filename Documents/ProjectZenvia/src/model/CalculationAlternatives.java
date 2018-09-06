package model;

/***
 * @author Gustavo Levandowski
 * @version 1.0
 */
public class CalculationAlternatives {

    private double numberOne, numberTwo;

    public CalculationAlternatives(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    //region calculation logic.

    /***
     * returns the result of the sum of the values
     */
    public double getSum() {
        return (numberOne + numberTwo);
    }

    /***
     * return the result of the subtraction of the numbers.
     */
    public double getSubtraction() {
        return (numberOne - numberTwo);
    }
    /***
     * return the result of the division of numbers.
     */
    public double getDivision() {
        return (numberOne / numberTwo);
    }

    /***
     * returns the result of multiplying numbers
     */
    public double getMultiplication() {
        return (numberOne * numberTwo);
    }
    //endregion


    @Override
    public String toString() {
        return "Could not perform calculation, please check typed field.";
    }
}
