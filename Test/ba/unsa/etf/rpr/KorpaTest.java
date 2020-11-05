package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtiklTest() {
        Korpa korpa = new Korpa();
        Artikl artikl1= new Artikl("Biciklo", 2000, "1111");
        Artikl artikl2= new Artikl("Biciklo", 2000, "1112");
        Artikl artikl3= new Artikl("Biciklo", 2000, "1113");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        korpa.dodajArtikl(artikl3);
        assertEquals(2000, korpa.getArtikli()[0].getCijena());
        assertEquals("1112", korpa.getArtikli()[1].getKod());
        assertEquals("Biciklo", korpa.getArtikli()[2].getNaziv());
    }

    @Test
    void izbaciArtiklSaKodomTest() {
        Korpa korpa = new Korpa();
        Artikl artikl1= new Artikl("Biciklo", 2000, "1111");
        korpa.dodajArtikl(artikl1);
        assertNull(korpa.izbaciArtiklSaKodom("1112"));
    }


    @Test
    void dajUkupnuCijenuArtikalaTest1() {
        Korpa korpa = new Korpa();
        Artikl artikl1= new Artikl("Biciklo", 2000, "1111");
        Artikl artikl2= new Artikl("Biciklo", 2000, "1112");
        Artikl artikl3= new Artikl("Biciklo", 2000, "1113");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        korpa.dodajArtikl(artikl3);
        assertEquals(6000, korpa.dajUkupnuCijenuArtikala());

    }

    @Test
    void dajUkupnuCijenuArtikalaTest2() {
        Korpa korpa = new Korpa();
        Artikl artikl1= new Artikl("Biciklo", 2000, "1111");
        Artikl artikl2= new Artikl("Biciklo", 2000, "1112");
        Artikl artikl3= new Artikl("Biciklo", 2000, "1113");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        korpa.dodajArtikl(artikl3);
        korpa.izbaciArtiklSaKodom("1111");
        assertEquals(4000, korpa.dajUkupnuCijenuArtikala());
    }
}