package test;

import XML.ChargeurMagasin;
import donnees.CD;
import donnees.Magasin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class MagasinTest {

    private Magasin magasin;
    private ChargeurMagasin chrg;


    @Test
    void testTrierAlbum() throws FileNotFoundException {
        chrg = new ChargeurMagasin("O:/try/2024_coo_cd_e6492u/TD11/src/musicbrainzSimple");
        magasin = chrg.chargerMagasin();
        // Vérifiez l'ordre des CD avant le tri
        assertEquals("Bénabard", magasin.getCd(0).getNomCD());
        assertEquals("Essence ordinaire", magasin.getCd(-1));

        // Tri des albums
        magasin.trierAlbum();

        // Vérifiez l'ordre des CD après le tri
        assertEquals("Believe", magasin.getCd(0));
        assertEquals("Whitney Houston", magasin.getCd(-1));
    }
}
