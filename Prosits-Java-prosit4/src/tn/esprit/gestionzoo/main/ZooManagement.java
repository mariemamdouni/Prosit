package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);




        /*Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();*/

        //Aquatic a = new Aquatic("Aquatic family", "Poisson", 2, false, "Bassin");
        Terrestrial t = new Terrestrial("Mammifères", "Chien", 4, true, 4);
        Dolphin d = new Dolphin("Cétacés", "Flipper", 8, true, "Océan", 25.5f);
        Penguin p = new Penguin("Oiseaux", "Pingou", 3, false, "Mer", 12.0f);

        System.out.println("Objets créés avec constructeurs paramétrés ");

        //System.out.println(a);
        System.out.println(t);
        System.out.println(d);
        System.out.println(p);


        //a.swim();
        //d.swim();
        //p.swim();


        System.out.println("!! TEST PROSIT 6 !!");

        Zoo zoo = new Zoo();

        Dolphin d1 = new Dolphin("Cétacés", "Dodo", 8, true, "Océan", 25);
        Penguin p1 = new Penguin("Oiseaux", "Pingo", 3, false, "Mer", 12);
        Penguin p2 = new Penguin("Oiseaux", "Pingi", 5, false, "Mer", 18);

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);

        zoo.makeAquaticSwim();

        System.out.println("Profondeur max des pingouins : " + zoo.maxPenguinSwimmingDepth());

        zoo.displayNumberOfAquaticByType();

        // Test equals
        Dolphin d2 = new Dolphin("Cétacés", "Flipper", 8, true, "Océan", 30);
        System.out.println("d1.equals(d2) ? " + d1.equals(d2));
    }



    }


