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

        //Animal lion = new Animal("Semir", "Manouba", 5, false);
        //Animal hsan = new Animal ("Stoura" , "Bardo" , 100 , true);
        //Animal lionwow = new Animal("Semir", "Manouba", 5, false);
        //Animal far = new Animal ("ferid" , "Hay Tadhamen", 69, true);
        //Animal jormena = new Animal ("Jormena" , "Gabes", 69, true);

        //System.out.println(myZoo.addAnimal(lion));
        //System.out.println(myZoo.addAnimal(hsan));
        //System.out.println(myZoo.addAnimal(lionwow));
        //System.out.println(myZoo.addAnimal(far));

        //myZoo.displayAnimals();
        //System.out.println("bech nfassakh, ireturni boolean");
        //myZoo.removeAnimal(lionwow);

        //myZoo.displayAnimals();

        //System.out.println("Winou? " + myZoo.searchAnimal(lion));

        //System.out.println("zoo feragh?" + myZoo.isZooFull());

        //System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");

        //System.out.println("Comparaison bin zouz zoo");
        Zoo z1 = new Zoo("z1", "Ariana");
        Zoo z2 = new Zoo("z2", "Ariana");

        //z1.addAnimal(lion);

        //z2.addAnimal(lionwow);
        //z2.addAnimal(far);
        //z2.addAnimal(jormena);

        Dolphin douphena = new Dolphin("Dalanda", "Fi Darou", 5, true, "Océan", 20.0f);
        Penguin kanfoud = new Penguin("Ya lotfi", "rond point", 69, false, "fel rond point", 140.0f);

        z1.addAnimal(douphena);
        z1.addAnimal(kanfoud);

        z1.displayAnimals();

        AnimalAquatique samaka = new AnimalAquatique("houta","fel bhar",44,false, "rond point lflouka");


        douphena.swim();
        samaka.swim();
        kanfoud.swim();





        System.out.println("Zoo plus grand est :" + Zoo.comparerZoo(z1, z2));
    }
}
