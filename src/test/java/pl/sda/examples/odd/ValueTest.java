package pl.sda.examples.odd;

import org.junit.Before;
import org.junit.Test;
import pl.sda.exaples.odd.Value;
import sun.awt.SunHints;

import static org.junit.Assert.assertTrue;

public class ValueTest {
    private Value testedValue;

    @Before
    public void before() {
        testedValue = new Value();
    }

    @Test
    public void testOddInNumber() {
        //given
        Integer number = 1;

        //when
        boolean isOdd = testedValue.isOdd(number);

        //then
        assertTrue(isOdd);
    }

    @Test (expected= IllegalArgumentException.class)
    public void testEvenInNumber() {
        //given
        Integer number = null;

        //when
        testedValue.isOdd(number);
//        boolean isOdd = new Value().isOdd(number);

//        //then
//        assertTrue(isOdd);
    }

    @Test (expected= IllegalArgumentException.class)
    public void testEvenInNumber() {
        //given
        Integer number = null;

        //when
        testedValue.isOdd(number);
//        boolean isOdd = new Value().isOdd(number);

//        //then
//        assertTrue(isOdd);
    }

}
