public class Employe implements Comparable<Employe>{
    int id;
    String name;
    String lastName;
    String department;
    int grade;

    public Employe(){

    }

    public Employe(int id, String name, String lastName, String department, int grade) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.grade = grade;
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
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", grade=" + grade +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (o instanceof Employe e)
            return e.id == id && e.name.equals(name);
        return false;
    }

    @Override
    public int compareTo(Employe o) {
        return id - o.id;
    }


}
