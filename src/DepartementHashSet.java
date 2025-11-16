import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }
    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equals(nomDepartement)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }
    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }
    @Override
    public void afficherDepartements() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }
    @Override
    public void trierDepartementsParId() {
        ArrayList<Departement> list = new ArrayList<>(departements);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getId() > list.get(j).getId()) {
                    Departement temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (Departement d : list) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        ArrayList<Departement> list = new ArrayList<>(departements);
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int compareNom = list.get(i).getNomDepartement()
                        .compareTo(list.get(j).getNomDepartement());

                if (compareNom > 0 ||
                        (compareNom == 0 &&
                                list.get(i).getNombreEmployes() > list.get(j).getNombreEmployes())) {

                    Departement temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (Departement d : list) {
            System.out.println(d);
        }

    }
}
