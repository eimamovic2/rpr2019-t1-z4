package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @org.junit.jupiter.api.Test
    void getNaziv() {
        Artikl biciklo=new Artikl("Biciklo",200,"2000");
        assertEquals("Biciklo",biciklo.getNaziv());
    }

    @org.junit.jupiter.api.Test
    void getCijena() {
        Artikl biciklo=new Artikl("Biciklo",200,"2000");
        assertEquals(200,biciklo.getCijena());
    }

    @org.junit.jupiter.api.Test
    void getKod() {
        Artikl biciklo=new Artikl("Biciklo",200,"2000");
        assertEquals("2000",biciklo.getKod());
    }
}