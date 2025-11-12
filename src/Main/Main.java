package Main;

import Entities.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Amira", "Zouari", "IT", 3);
        Employe e2 = new Employe(2, "Sami", "Trabelsi", "RH", 2);
        Employe e3 = new Employe(3, "Karim", "Mansour", "IT", 1);
        Employe e4 = new Employe(4, "Nour", "Ben Ali", "Finance", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("Liste des employés");
        societe.displayEmploye();

        System.out.println("recherche 'Amira' : " + societe.rechercherEmploye("Amira"));
        System.out.println("recherche e2 : " + societe.rechercherEmploye(e2));

        societe.supprimerEmploye(e3);
        System.out.println("Après suppression de Karim :");
        societe.displayEmploye();

        societe.trierEmployeParId();
        System.out.println("Tri par ID");
        societe.displayEmploye();

        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("Tri par Département/Grade/Nom ");
        societe.displayEmploye();
    }
}
