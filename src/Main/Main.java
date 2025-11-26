package Main;

import Entities.AffectationHashMap;
import Entities.Departement;
import Entities.Employe;

public class Main {
    public static void main(String[] args) {

        Employe e1 = new Employe(2, "Ali");
        Employe e2 = new Employe(1, "Mouna");
        Employe e3 = new Employe(3, "Nidhal");

        Departement d1 = new Departement(10, "IT", 30);
        Departement d2 = new Departement(20, "Finance", 15);

        AffectationHashMap gestion = new AffectationHashMap();

        gestion.ajouterEmployeDepartement(e1, d1);
        gestion.ajouterEmployeDepartement(e2, d2);
        gestion.ajouterEmployeDepartement(e3, d1);

        gestion.ajouterEmployeDepartement(e1, d2);

        gestion.afficherEmployesEtDepartements();

        System.out.println("suppression");
        gestion.supprimerEmployeEtDepartement(e1, d1);
        gestion.afficherEmployesEtDepartements();

        System.out.println("employés");
        gestion.afficherEmployes();

        System.out.println("départements");
        gestion.afficherDepartements();

        System.out.println("trie par id");
        System.out.println(gestion.trierMap());
    }
}
