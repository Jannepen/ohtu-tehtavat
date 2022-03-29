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
        for (int i = 0; i < ostokset.size(); i++) {
            if (ostokset.get(i).tuotteenNimi() == lisattava.getNimi()) {
                ostokset.get(i).muutaLukumaaraa(1);
                tavarat++;
                hinta += lisattava.getHinta();
                return;
            }
        }
        ostokset.add(new Ostos(lisattava));
        tavarat++;
        hinta += lisattava.getHinta();
        // lisää tuotteen
    }
 
    public void poista(Tuote poistettava) {
        for (int i = 0; i < ostokset.size(); i++) {
            if (ostokset.get(i).tuotteenNimi() == poistettava.getNimi()) {
                if (ostokset.get(i).lukumaara() == 1) {
                    ostokset.remove(i);
                } else {
                    ostokset.get(i).muutaLukumaaraa(-1);
                }
            }
        }
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
