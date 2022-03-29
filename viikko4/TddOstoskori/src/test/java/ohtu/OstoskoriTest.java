package ohtu;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OstoskoriTest {

    Ostoskori kori;

    @Before
    public void setUp() {
        kori = new Ostoskori();
    }
    
    // step 5
    @Test
    public void kahdenEriTuotteenLisaamisenJalkeenOstoskorinHintaTuotteidenHintojenSumma() {
        Tuote maito = new Tuote("maito", 3);
        Tuote leipa = new Tuote("leipa", 4);
        kori.lisaaTuote(maito);
        kori.lisaaTuote(leipa);
        assertEquals(7, kori.hinta());
    }
    
    // step 4
    @Test
    public void kahdenEriTuotteenLisaamisenJalkeenOstoskorissaKaksiTavaraa() {
        Tuote maito = new Tuote("maito", 3);
        Tuote leipa = new Tuote("leipa", 4);
        kori.lisaaTuote(maito);
        kori.lisaaTuote(leipa);
        assertEquals(2, kori.tavaroitaKorissa());
    }
    
    // step 3
    @Test
    public void yhdenTuotteenLisaamisenJalkeenOstoskorinHintaTuotteenHinta() {
        Tuote maito = new Tuote("maito", 3);
        kori.lisaaTuote(maito);
        assertEquals(3, kori.hinta());
    }
    
    // step 2
    @Test 
    public void yhdenTuotteenLisaamisenJalkeenKorissaYksiTuote() {
        Tuote maito = new Tuote("maito", 3);
        kori.lisaaTuote(maito);
        assertEquals(1, kori.tavaroitaKorissa());
    }

    // step 1
    @Test
    public void ostoskorinHintaJaTavaroidenMaaraAlussa() { 
        assertEquals(0, kori.hinta());
        assertEquals(0, kori.tavaroitaKorissa());
    }

}
