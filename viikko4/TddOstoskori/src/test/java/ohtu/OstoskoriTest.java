package ohtu;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OstoskoriTest {

    Ostoskori kori;

    @Before
    public void setUp() {
        kori = new Ostoskori();
    }
    
    // step 11
    @Test
    public void kahdenSamanTuotteenLisaamisenJalkeenOstoskoriSisaltaaYhdenOstoksen() {
        Tuote maito = new Tuote("maito", 3);
        kori.lisaaTuote(maito);
        kori.lisaaTuote(maito);
        
        assertEquals(1, kori.ostokset().size());
    }
    
    // step 10
    @Test
    public void kahdenEriTuotteenLisaamisenJalkeenOstoskoriSisaltaaKaksiOstosta() {
        Tuote maito = new Tuote("maito", 3);
        Tuote leipa = new Tuote("leipa", 4);
        kori.lisaaTuote(maito);
        kori.lisaaTuote(leipa);
        
        assertEquals(2, kori.ostokset().size());
    }
    
    // step 9
    @Test
    public void yhdenTuotteenLisaamisenJalkeenOstoskoriSisaltaaOstoksenJollaTuotteenNimiJaLukumaaraYksi() {
        Tuote maito = new Tuote("maito", 3);
        kori.lisaaTuote(maito);
        Ostos ostos = kori.ostokset().get(0);
        
        assertEquals(1, ostos.lukumaara());
        assertEquals("maito", ostos.tuotteenNimi());
    }
    
    // step 8
    @Test
    public void yhdenTuotteenLisaamisenJalkeenOstoskoriSisaltaaYhdenOstoksen() {
        Tuote maito = new Tuote("maito", 3);
        kori.lisaaTuote(maito);
        List<Ostos> ostokset = kori.ostokset();
        
        assertEquals(1, ostokset.size());
    }
    
    // step 7
    @Test
    public void kahdenSamanTuotteenLisaamisenJalkeenOstoskorinHintaKaksiKertaaTuote() {
        Tuote maito = new Tuote("maito", 3);
        kori.lisaaTuote(maito);
        kori.lisaaTuote(maito);
        assertEquals(6, kori.hinta());
    }
    
    // step 6
    @Test
    public void kahdenSamanTuotteenLisaamisenJalkeenOstoskorissaKaksiTavaraa() {
        Tuote maito = new Tuote("maito", 3);
        kori.lisaaTuote(maito);
        kori.lisaaTuote(maito);
        assertEquals(2, kori.tavaroitaKorissa());
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
