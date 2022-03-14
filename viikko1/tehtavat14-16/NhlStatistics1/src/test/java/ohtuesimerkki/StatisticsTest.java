package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StatisticsTest {
 
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }  
    
    
//    @Test
//    public void teamPalauttaaPelaajat() {
//        List<Player> pelaajat = new ArrayList<>();
//        pelaajat.add(new Player("Semenko", "EDM", 4, 12));
//        pelaajat.add(new Player("Kurri",   "EDM", 37, 53));
//        pelaajat.add(new Player("Gretzky", "EDM", 35, 89));
//        assertEquals(pelaajat, stats.team("EDM"));
//    }
    
    
    
    @Test
    public void searchPalauttaaNull() {
        assertEquals(null, stats.search("Ovetchkin"));
    }
    
//    @Test
//    public void searchPalauttaaPelaajan() {
//        Player kurri = new Player("Kurri",   "EDM", 37, 53);
//        System.out.print(kurri);
//        assertEquals(kurri, stats.search("Kurri"));
//    }
}
