public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe emp1 = new Employe();
        emp1.id = 1;
        emp1.name = "Alice";
        emp1.lastName = "Martin";
        emp1.department = "Informatique";
        emp1.grade = 3;

        Employe emp2 = new Employe();
        emp2.id = 2;
        emp2.name = "Bob";
        emp2.lastName = "Durand";
        emp2.department = "RH";
        emp2.grade = 2;

        Employe emp3 = new Employe();
        emp3.id = 3;
        emp3.name = "Alice";
        emp3.lastName = "Lemoine";
        emp3.department = "Informatique";
        emp3.grade = 1;

        // Ajouter des employés
        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        System.out.println("Liste initiale :");
        societe.displayEmploye();

        // Rechercher par nom
        System.out.println("\nRecherche par nom 'Alice' : " + societe.rechercherEmploye("Alice"));

        // Rechercher par objet
        System.out.println("Recherche d’un employé existant : " + societe.rechercherEmploye(emp2));

        // Trier par ID
        societe.trierEmployeParId();
        System.out.println("\nTri par ID :");
        societe.displayEmploye();

        // Trier par département puis grade
        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\nTri par département puis grade :");
        societe.displayEmploye();

        // Supprimer un employé
        societe.supprimerEmploye(emp2);
        System.out.println("\nAprès suppression de Bob :");
        societe.displayEmploye();
    }
}
