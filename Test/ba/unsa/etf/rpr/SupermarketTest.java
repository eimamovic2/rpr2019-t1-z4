package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodomTest1() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl1= new Artikl("Biciklo", 2000, "1111");
        supermarket.dodajArtikl(artikl1);
        assertNotNull(supermarket.izbaciArtiklSaKodom("1111"));
    }

    @Test
    void izbaciArtiklSaKodomTest2() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl1= new Artikl("Biciklo", 2000, "1111");
        supermarket.dodajArtikl(artikl1);
        assertNull(supermarket.izbaciArtiklSaKodom("1112"));
    }

    @Test
    void dodajArtiklTest() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl1= new Artikl("Biciklo", 2000, "1111");
        Artikl artikl2= new Artikl("Biciklo", 2000, "1112");
        Artikl artikl3= new Artikl("Biciklo", 2000, "1113");
        supermarket.dodajArtikl(artikl1);
        supermarket.dodajArtikl(artikl2);
        supermarket.dodajArtikl(artikl3);
        assertEquals(2000, supermarket.getArtikli()[0].getCijena());
        assertEquals("1112", supermarket.getArtikli()[1].getKod());
        assertEquals("Biciklo", supermarket.getArtikli()[2].getNaziv());
    }
}