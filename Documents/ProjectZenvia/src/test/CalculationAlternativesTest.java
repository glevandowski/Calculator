package test;

import model.CalculationAlternatives;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculationAlternativesTest {

    private CalculationAlternatives calculate;

    private static double numberOne = 5;
    private static double numberTwo = 5;

    private static double valueExpectedDivision = 1;
    private static double valueExpectedMultiplication = 25;
    private static double valueExpectedSum = 10;
    private static double valueExpectedSubtraction = 0;


    @BeforeEach
    void setUp() {
        calculate = new CalculationAlternatives(numberOne, numberTwo);
    }

    @Test
    void valueIsExpected() {

        assertAll( () -> assertEquals( valueExpectedDivision, calculate.getDivision()),
                   () -> assertEquals( valueExpectedMultiplication, calculate.getMultiplication()),
                   () -> assertEquals( valueExpectedSum, calculate.getSum()),
                   () -> assertEquals( valueExpectedSubtraction, calculate.getSubtraction()));
    }

    @Test
    void fieldIsTrue() {
        assertTrue(calculate.getDivision() == valueExpectedDivision);
    }
}