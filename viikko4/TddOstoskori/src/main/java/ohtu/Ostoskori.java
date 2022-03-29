package ohtu;

import java.util.ArrayList;
import java.util.List;

public class Ostoskori {
    private List<Ostos> ostokset;
    private int tavarat;
    private int hinta;
    
    public Ostoskori() {
        this.ostokset = new ArrayList<>();
    }
 
    public int tavaroitaKorissa() {
        // kertoo korissa olevien tavaroiden lukumäärän
        // eli jos koriin lisätty 2 kpl tuotetta "maito", 
        //   tulee metodin palauttaa 2 
        // jos korissa on 1 kpl tuotetta "maito" ja 1 kpl tuotetta "juusto", 
        //   tulee metodin palauttaa 2   

        return tavarat;
    }
 
    public int hinta() {
        // kertoo korissa olevien tuotteiden yhteenlasketun hinnan
 
        return hinta;
    }
 
    public void lisaaTuote(Tuote lisattava) {
        ostokset.add(new Ostos(lisattava));
        tavarat++;
        hinta += lisattava.getHinta();
        // lisää tuotteen
    }
 
    public void poista(Tuote poistettava) {
        // poistaa tuotteen
    }
 
    public List<Ostos> ostokset() {
        // palauttaa listan jossa on korissa olevat ostokset
 
        return ostokset;
    }
 
    public void tyhjenna() {
        // tyhjentää korin
    }
}
