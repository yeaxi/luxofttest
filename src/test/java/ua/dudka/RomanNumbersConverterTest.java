package ua.dudka;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Rostislav Dudka
 */
public class RomanNumbersConverterTest {

    private RomanNumbersConverter converter = new RomanNumbersConverterImpl();


    @Test
    public void convert_I_ShouldReturn_1() throws Exception {
        int numericValue = converter.convert("I");

        assertEquals(1, numericValue);
    }

    @Test
    public void convert_II_ShouldReturn_2() throws Exception {
        int numericValue = converter.convert("II");

        assertEquals(2, numericValue);
    }

    @Test
    public void convert_III_ShouldReturn_3() throws Exception {
        int numericValue = converter.convert("III");

        assertEquals(3, numericValue);
    }

    @Test
    public void convert_IV_ShouldReturn_4() throws Exception {
        int numericValue = converter.convert("IV");

        assertEquals(4, numericValue);
    }

    @Test
    public void convert_XI_ShouldReturn_11() throws Exception {
        int numericValue = converter.convert("XI");

        assertEquals(11, numericValue);
    }
}