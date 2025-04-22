import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;

public class DepartmentHashSet implements IDepartment<Department> {
    private Set<Department> myHashSet = new HashSet<>();

    @Override
    public void ajouterDepartement(Department department) {
        myHashSet.add(department);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Department> it = myHashSet.iterator();
        while (it.hasNext()) {
            Department department = it.next();
            if (department.getName().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Department department) {
        return myHashSet.contains(department);
    }

    @Override
    public void supprimerDepartement(Department department) {
        myHashSet.remove(department);
    }

    @Override
    public void displayDepartement() {
        for (Department department : myHashSet) {
            System.out.println(department);
        }
    }

    @Override
    public TreeSet<Department> trierDepartementById() {
        return new TreeSet<>(myHashSet);
    }
}
