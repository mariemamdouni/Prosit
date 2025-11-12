package Entities;

import Interfaces.IGestion;
import java.util.*;

public class SocieteArrayList implements IGestion<Employe> {

    private List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        employes.sort(new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int depCompare = e1.getNomDepartement().compareToIgnoreCase(e2.getNomDepartement());
                if (depCompare != 0) return depCompare;

                int gradeCompare = Integer.compare(e1.getGrade(), e2.getGrade());
                if (gradeCompare != 0) return gradeCompare;

                return e1.getNom().compareToIgnoreCase(e2.getNom());
            }
        });
    }
}
