import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SocieteArrayList implements IGestion<Employe> {
    List<Employe> listEmployees = new ArrayList<>();

    public void ajouterEmploye(Employe employee) {
        listEmployees.add(employee);
    }

    public boolean rechercherEmploye(String nom){
        for (int i=0;i < listEmployees.size(); i++)
        {
            if (listEmployees.get(i).getName().equals(nom))
                return true;
        }
        return false;
    }

    public boolean rechercherEmploye(Employe employee) {
        return listEmployees.contains(employee);
    };

    public void supprimerEmploye(Employe employee) {
        listEmployees.remove(employee);
    }

    public void displayEmploye(){
        System.out.println(listEmployees);
    }

    public void trierEmployeParId(){
        Collections.sort(listEmployees);
    }

    public void trierEmployeParNomDépartementEtGrade(){
        Collections.sort(listEmployees, new ComparatorDepartment().thenComparing(new ComparatorGrade()));
    }

}
