import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VaistasTest {
    protected Preke vaistas;

    @Before
    public void setUp() throws Exception {
        vaistas = new Vaistas("vaistas", 10);
    }

    @Test
    public void testGetpriceWithVat() throws Exception {
        double result = vaistas.getpriceWithVat();
        assertEquals(10.90, result, 0.01);
    }

    @Test
    public void testGetPriceInEuro() throws Exception {
        vaistas.price = 6.90;
        double result = vaistas.getPriceInEuro();
        assertEquals(2.00, result, 0.01);
    }
}