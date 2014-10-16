import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrekeTest {
    protected Preke preke;

    @Before
    public void setUp() throws Exception {
         preke = new Preke("pavadinimas", 10);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetpriceWithVat() throws Exception {
        double result = preke.getpriceWithVat();
        assertEquals(12.10, result, 0.01);
    }

    @Test
    public void testGetName() throws Exception {
        String name = preke.getName();
        assertEquals("pavadinimas", name);
    }

    @Test
    public void testGetNettoPrice() throws Exception {
        double result = preke.getNettoPrice();
        assertEquals(10.00, result, 0.01);
    }

    @Test
    public void testGetPriceInEuro() throws Exception {
        preke.price = 6.90;
        double result = preke.getPriceInEuro();
        assertEquals(2.00, result, 0.01);
    }
}