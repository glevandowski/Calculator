package view;

import model.CalculationAlternatives;
import presenter.MainPresenter;
import presenter.ViewInteractionListener;
import javax.swing.*;
import static javax.swing.JOptionPane.*;

/**
 * @author Gustavo Levandowski
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        ViewInteractionListener listener = new MainPresenter();
        double numberOne, numberTwo;

        showMessageDialog(getRootFrame(),
                "Prepared to answer your questions ?!", "Let's calculate",1);

        numberOne = Double.parseDouble(listener.openDialogs("Enter the first value:",true));
        numberTwo = Double.parseDouble(listener.openDialogs("Enter the second value:",true));

        CalculationAlternatives calculationAlternatives = new CalculationAlternatives(numberOne,numberTwo);

        String calculationOption =
                listener.openDialogs("Choose the calculation method:\n 1-Sum 2-Subtraction 3-Division 4-Multiplication",true);

        switch (calculationOption) {
            case "1":
                showMessageDialog(getRootFrame(),
                        listener.checkResult(numberOne, numberTwo,
                                             String.valueOf(calculationAlternatives.getSum())));
                break;
            case "2":
                showMessageDialog(getRootFrame(),
                        listener.checkResult(numberOne, numberTwo,
                                             String.valueOf(calculationAlternatives.getSubtraction())));
                break;
            case "3":
                showMessageDialog(getRootFrame(),
                        listener.checkResult(numberOne, numberTwo,
                                             String.valueOf(calculationAlternatives.getDivision())));
                break;
            case "4":
                showMessageDialog(getRootFrame(),
                        listener.checkResult(numberOne, numberTwo,
                                             String.valueOf(calculationAlternatives.getMultiplication())));
                break;
            default:
                JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"Option not found");
                break;
        }
    }
}

