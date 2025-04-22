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
        

    }
}