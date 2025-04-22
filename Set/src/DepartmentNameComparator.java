import java.util.Comparator;

public class DepartmentNameComparator implements Comparator<Department> {
    public int compare(Department d1, Department d2) {
        return d1.getName().compareToIgnoreCase(d2.getName());
    }
}
