package test;

import donnees.CD;
import donnees.Magasin;

public class TestTriMagasin {

    public static void main(String[] args) {
        // Initialisation du magasin
        Magasin magasin = new Magasin();

        // Ajout de quelques CDs
        CD cd1 = new CD("Marcelin", "Mike");
        CD cd2 = new CD("Valentin", "Victor");
        CD cd3 = new CD("Zacharie", "Zulu");
        CD cd4 = new CD("Thibault", "Tango");

        magasin.ajouteCd(cd1);
        magasin.ajouteCd(cd2);
        magasin.ajouteCd(cd3);
        magasin.ajouteCd(cd4);

        // Test de la méthode trierAlbum
        System.out.println("Avant tri par album :");
        System.out.println(magasin);


        magasin.trierAlbum();

        System.out.println("\n\n\nAprès tri par album :");
        System.out.println(magasin);

        // Vérification du premier et dernier terme après tri par album
        System.out.println("\n\nPremier album après tri par album: " + magasin.getCd(0).getNomCD());
        System.out.println("Dernier album après tri par album: " + magasin.getCd(magasin.getNombreCds() - 1).getNomCD());

        // Test de la méthode trierArtiste
        System.out.println("\n\n\n\nAvant tri par artiste :");
        System.out.println(magasin);

        magasin.trierArtiste();

        System.out.println("\n\n\nAprès tri par artiste :");
        System.out.println(magasin);

        // Vérification du premier et dernier terme après tri par artiste
        System.out.println("\n\nPremier artiste après tri par artiste: " + magasin.getCd(0).getNomArtiste());
        System.out.println("Dernier artiste après tri par artiste: " + magasin.getCd(magasin.getNombreCds() - 1).getNomArtiste());
    }
}
