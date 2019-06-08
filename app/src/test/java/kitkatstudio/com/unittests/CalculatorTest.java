package kitkatstudio.com.unittests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void checkAddition() throws Exception
    {
        assertEquals(4, MyCalculator.add(2,2));
    }

    @Test
    public void checkSubtraction() throws Exception
    {
        assertEquals(6,MyCalculator.subtract(10,4));
    }

    @Test
    public void checkMultiply() throws Exception
    {
        int expected = 6;
        int actual = MyCalculator.multiply(2,3);
        assertEquals("Subtraction", expected, actual);
    }

    @Test
    public void checkDivision() throws Exception {
        assertEquals("INFINITY", MyCalculator.divide(4, 0));
        assertEquals("NOT DEFINED", MyCalculator.divide(0, 0));
        assertEquals(2, Integer.parseInt(MyCalculator.divide(4, 2)));
    }
}
