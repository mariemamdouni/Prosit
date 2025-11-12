package Entities;

import Interfaces.IGestion;
import Interfaces.IRechercheAvancee;

import java.util.*;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
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
    public boolean rechercherEmploye(Employe t) {
        return employes.contains(t);
    }

    @Override
    public void supprimerEmploye(Employe t) {
        employes.remove(t);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes); // utilise Comparable (compareTo)
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
    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        for (Employe e : employes) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                resultat.add(e);
            }
        }
        return resultat;
    }
}
