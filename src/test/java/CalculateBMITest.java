import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculateBMITest {

    @Test(expected = IllegalArgumentException.class)
    @Parameters({"100, 0",
            "0,100",
            "-100, 100",
            "100, -100"})
    public void testIfHeightsIsZero(double weight, double height) {
        new CalculateBMI(weight, height);
    }

    @Test
    @Parameters({"40, 170, 13.84",
            "55, 170, 19.03",
            "80, 170, 27.68"})
    public void testCalculateBMI(double weight, double height, double bmiResult) {
        CalculateBMI CalculateBMI = new CalculateBMI(weight, height);
        assertEquals(bmiResult, CalculateBMI.calculate(), 0.01);
    }

    @Test
    @Parameters({"40, 170, Very severely underweight",
            "55, 170, Normal (healthy weight)",
            "80, 170, Overweight"})
    public void testBmiInterpretations(double weight, double height, String interpretation) {
        CalculateBMI CalculateBMI = new CalculateBMI(weight, height);
        double bmi = CalculateBMI.calculate();
        assertEquals(interpretation, CalculateBMI.interpret(bmi));
    }
}
