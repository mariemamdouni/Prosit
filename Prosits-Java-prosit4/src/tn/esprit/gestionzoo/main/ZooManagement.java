package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Mini Zoo", "Tunis");

        Animal a1 = new Animal("Félins", "Simba", 5, true);
        Animal a2 = new Animal("Oiseaux", "Coco", -2, false);
        Animal a3 = new Animal("Ursidés", "Baloo", 8, true);
        Animal a4 = new Animal("Mammifères", "Longneck", 4, true);

        try {
            zoo.addAnimal(a1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Animaux ajoutés : 1");

        try {
            zoo.addAnimal(a2);
        } catch (InvalidAgeException e) {
            System.err.println("erreur : " + e.getMessage());
        } catch (ZooFullException e) {
            System.err.println("erreur  : " + e.getMessage());
        }
        System.out.println("Animaux ajoutés : 1");

        try {
            zoo.addAnimal(a3);
            zoo.addAnimal(a4);
        } catch (InvalidAgeException | ZooFullException e) {
            System.err.println("Exception : " + e.getMessage());
        }

        System.out.println("Programme terminé+gestion des exceptions");
    }
}