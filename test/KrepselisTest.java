import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class KrepselisTest {
    protected Preke preke;
    protected Preke vaistas;
    protected ArrayList<Preke> prekes;
    protected Krepselis krepselis;

    @Before
    public void setUp() throws Exception {
        krepselis = new Krepselis();
        preke = new AlkoholinisGerimas("pavadinimas", 10.00, 41.00, 0.7);
        vaistas = new Vaistas("vaistas", 10.00);
        prekes = new ArrayList<>();
    }

    @Test
    public void testAddGood() throws Exception {
        prekes.add(preke);
        int result = prekes.size();
        assertEquals(1, result);
    }

    @Test
    public void testGetTotalPrice() throws Exception {
        krepselis.addGood(preke);
        krepselis.addGood(vaistas);
        double result = krepselis.getTotalPrice();
        assertEquals(20.00, result, 0.00);
    }

    @Test
    public void testGetTotalPriceWithVat() throws Exception {
        krepselis.addGood(preke);
        krepselis.addGood(vaistas);
        double result = krepselis.getTotalPriceWithVat();
        assertEquals(25.80, result, 0.01);
    }

    @Test
    public void testGetTotalPriceInEuro() throws Exception {
        krepselis.addGood(preke);
        krepselis.addGood(vaistas);
        krepselis.getTotalPriceWithVat();
        double result = krepselis.getTotalPriceInEuro();
        assertEquals(7.48, result, 0.01);
    }

    @Test
    public void testDuokPrekiuKieki() throws Exception {
        krepselis.addGood(preke);
        krepselis.addGood(vaistas);
        int result = krepselis.duokPrekiuKieki();
        assertEquals(2, result);
    }

    @Test
    public void testDuokPrekesPavadinima() throws Exception {
        krepselis.addGood(preke);
        krepselis.addGood(vaistas);
        String result = krepselis.duokPrekesPavadinima(0);
        assertSame("pavadinimas", result);
        result = krepselis.duokPrekesPavadinima(1);
        assertSame("vaistas", result);
    }
}