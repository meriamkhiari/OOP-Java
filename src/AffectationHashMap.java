import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;


public class AffectationHashMap {
    Map<Employe, Department> employeDep = new HashMap<>();

    public AffectationHashMap() {

    }

    public void ajouterEmployeDepartment(Employe emp, Department dep) {
        employeDep.put(emp, dep);
    }

    void afficherEmployesEtDepartements(){
        for(Map.Entry<Employe,Department> e : employeDep.entrySet()){
            System.out.println(e.getKey().getNom() + " " + e.getKey().getPrenom() + " is in the " + e.getValue().getName()+ " Departement");
        }
    }

    void supprimerEmploye(Employe emp){
        employeDep.remove(emp);
    }

    void supprimerEmployeEtDepartement(Employe emp, Department dep){
        Department department = employeDep.get(emp);
        if(department.equals(dep)){
            employeDep.remove(emp);
        }
    }

    void afficherEmployes(){
        Set<Employe> employees = employeDep.keySet();
        Iterator<Employe> iterator = employees.iterator();
        while(iterator.hasNext()){
            System.out.println("Key" + iterator.next());
        }
    }

    void afficherDepartments(){
        Collection<Department> departments = employeDep.values();
        for (Department department : departments) {
            System.out.println("Value :" + departments);
        }
    }

    boolean rechercherEmploye(Employe emp){
        return employeDep.containsKey(emp);
    }

    boolean rechercherDepartement (Department d){
        return employeDep.containsValue(d);
    }
}
