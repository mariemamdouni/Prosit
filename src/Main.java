public class Main {
    public static void main(String[] args) {

        DepartementHashSet s = new DepartementHashSet();

        Departement d1 = new Departement(1, "IT", 20);
        Departement d2 = new Departement(2, "Finance", 15);
        Departement d4 = new Departement(1, "IT", 40); // doublon → non ajouté

        System.out.println("Ajout !!!!!!");
        s.ajouterDepartement(d1);
        s.ajouterDepartement(d2);
        s.ajouterDepartement(d4);
        s.afficherDepartements();

        System.out.println("Recherche !!!!!!");
        System.out.println(s.rechercherDepartement("Finance"));
        System.out.println("Suppression !!!!!");
        s.supprimerDepartement(d2);
        s.afficherDepartements();

        System.out.println("Tri par ID");
        s.trierDepartementsParId();

        System.out.println("Tri par nom & nb employés");
        s.trierDepartementsParNomEtNombreEmployes();
    }
}
