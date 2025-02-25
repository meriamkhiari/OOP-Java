package entities;

public abstract class AnimalAquatique extends Animal {
    protected String habitat;

    public AnimalAquatique(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void swim();

    @Override
    public String toString() {
        return "AnimalAquatique{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        AnimalAquatique other = (AnimalAquatique) obj;
        return this.name.equals(other.name) &&
                this.age == other.age &&
                this.habitat.equals(other.habitat);
    }
}
