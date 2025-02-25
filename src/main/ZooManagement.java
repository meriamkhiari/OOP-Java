package main;

import entities.*;

public class ZooManagement {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        String zooName = "Mon Zoo";
        int nbrCages = 2;

        ZooManagement zoo = new ZooManagement();
        zoo.zooName = zooName;
        zoo.nbrCages = nbrCages;

        Zoo myZoo = new Zoo("Esprit", "Ariana");

        // Création d'animaux aquatiques
        Dolphin douphena = new Dolphin("Dauphin", "Dalanda", 5, true, "Océan", 20.0f);
        Penguin kanfoud = new Penguin("Pingouin", "Ya Lotfi", 7, false, "Banquise", 140.0f);
        AnimalAquatique samaka = new AnimalAquatique("Poisson", "Houta", 2, false, "Rivière");

        // Ajout des animaux aquatiques dans le zoo
        myZoo.addAquaticAnimal(douphena);
        myZoo.addAquaticAnimal(kanfoud);
        myZoo.addAquaticAnimal(samaka);

        // Affichage des animaux aquatiques du zoo
        System.out.println("\nListe des animaux aquatiques dans le zoo :");
        myZoo.displayAquaticAnimals();

        // Test des méthodes de nage
        System.out.println("\nLes animaux nagent :");
        douphena.swim();
        kanfoud.swim();
        samaka.swim();

        // Faire nager tous les animaux aquatiques
        myZoo.makeAllAquaticAnimalsSwim();


        // Affichage du zoo
        System.out.println("\nInformations sur le zoo :");
        myZoo.displayZoo();
    }
}
