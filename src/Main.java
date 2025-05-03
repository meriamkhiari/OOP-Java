import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        DepartmentHashSet departmentHashSet = new DepartmentHashSet();

        Department department1 = new Department(1, "Sales", 12);
        Department department2 = new Department(2, "Bleda ou rkeka", 18);
        Department department3 = new Department(3, "Tkachkich hnek", 22);

        departmentHashSet.ajouterDepartement(department1);
        departmentHashSet.ajouterDepartement(department2);
        departmentHashSet.ajouterDepartement(department3);

        departmentHashSet.displayDepartement();

        boolean found = departmentHashSet.rechercherDepartement("Sales");
        System.out.println(found);

        found = departmentHashSet.rechercherDepartement(department1);
        System.out.println(found);

        departmentHashSet.supprimerDepartement(department1);
        departmentHashSet.displayDepartement();

        TreeSet<Department> sortedDepartments = departmentHashSet.trierDepartementById();
        for (Department department : sortedDepartments) {
            System.out.println(department);
        }

        AffectationHashMap depHashset = new AffectationHashMap();
        Department dep1 = new Department(41,"1",0);
        Department dep2 = new Department(62,"2",0);

        Employe em1 = new Employe(2,"em","1","exmp",5);
        Employe em2 = new Employe(42,"emye","2","exmp",5);
        Employe em3 = new Employe(62,"nt","3","exmp",5);
        Employe em4 = new Employe(58,"exm","4","exmp",5);

        depHashset.ajouterEmployeDepartment(em1,dep1);
        depHashset.ajouterEmployeDepartment(em2,dep2);
        depHashset.ajouterEmployeDepartment(em3,dep2);
        depHashset.ajouterEmployeDepartment(em4,dep1);

        depHashset.afficherEmployesEtDepartements();
        System.out.println("Affichage");

        depHashset.supprimerEmploye(em2);
        System.out.println("Supprimé");

        depHashset.afficherEmployesEtDepartements();
        System.out.println("Affichage");


        //depHashset.supprimerEmployeEtDepartement(em2,dep1);
        //System.out.println("Affichage");

        //depHashset.supprimerEmployeEtDepartement(em2,dep2);
        //System.out.println("Affichage");

        depHashset.afficherEmployes();

        System.out.println(depHashset.rechercherEmploye(em1));
        System.out.println(depHashset.rechercherDepartement(dep1));
    }
}