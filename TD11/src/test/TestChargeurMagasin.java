package test;

import XML.ChargeurMagasin;
import donnees.Magasin;
import main.MainChargeurMagasin;

import java.io.FileNotFoundException;

public class TestChargeurMagasin {

    MainChargeurMagasin chargeur;

    public void init() {
        chargeur = new MainChargeurMagasin();
    }

    public void testFonctionnel() {
        String chemin = "Benabar_Benabar.xml";

        try {
            ChargeurMagasin chargeuuuurrr = new ChargeurMagasin("O:/try/2024_coo_cd_e6492u/TD11/src/musicbrainzSimple");
            chargeuuuurrr.chargerMagasin();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public void testNonFonctionnel() {
        String chemin = "Benabar_Benabar.xml";

        try {
            ChargeurMagasin chargeuuuurrr2 = new ChargeurMagasin("pot2P1TUR");
            chargeuuuurrr2.chargerMagasin();
        } catch (FileNotFoundException e2) {
            System.out.println(e2);
        }
    }

    public static void main(String[] args) {
        TestChargeurMagasin test = new TestChargeurMagasin();
        test.init();
        test.testFonctionnel();
        test.testNonFonctionnel();
    }
}
