package ua.dudka;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Rostislav Dudka
 */
public class RomanNumbersConverterBigNumbersTest {

    private RomanNumbersConverter converter = new RomanNumbersConverterImpl();


    @Test
    public void convert_MDCL_ShouldReturn_1650() throws Exception {
        int numericValue = converter.convert("MDCL");

        assertEquals(1650, numericValue);
    }

    @Test
    public void convert_XMDCL_ShouldReturn_1640() throws Exception {
        int numericValue = converter.convert("XMDCL");

        assertEquals(1640, numericValue);
    }

    @Test
    public void convert_MCMXLIV_ShouldReturn_1944() throws Exception {
        int numericValue = converter.convert("MCMXLIV");

        assertEquals(1944, numericValue);
    }


}