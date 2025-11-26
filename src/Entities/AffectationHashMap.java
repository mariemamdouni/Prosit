package Entities;

import Entities.Departement;
import Entities.Employe;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private HashMap<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }
    public void ajouterEmployeDepartement(Employe e, Departement d) {

        if (affectations.containsKey(e)) {
            System.out.println("affectation déjà ajouté " + e.getNom());
        } else {
            affectations.put(e, d);
            System.out.println("affectation ajouté" + e.getNom() + " → " + d.getNomDepartement());
        }
    }

    public void afficherEmployesEtDepartements() {

        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {

        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("affectation supprimée : " + e.getNom());
        } else {
            System.out.println("affectation introuvable");
        }
    }
    public void afficherEmployes() {
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }
    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }

}
