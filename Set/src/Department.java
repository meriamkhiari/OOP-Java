public class Department implements Comparable<Department>{
    public int id;
    public String name;
    public int numberEmployees;

    public Department() {}

    public Department(int id, String name, int numberEmployees) {
        this.id = id;
        this.name = name;
        this.numberEmployees = numberEmployees;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberEmployees() {
        return numberEmployees;
    }
    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }
    public String toString() {
        return id + " " + name + " " + numberEmployees;
    }
    public boolean equals(Department d) {
        return id == d.id && name.equals(d.name) && numberEmployees == d.numberEmployees;
    }
    public int hashCode() {
        return id + name.hashCode() + numberEmployees;
    }
    @Override
    public int compareTo(Department other) {
        return Integer.compare(this.id, other.id); // Tri par ID
    }
}


