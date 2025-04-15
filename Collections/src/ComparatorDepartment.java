import java.util.Comparator;

public class ComparatorDepartment implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }
}