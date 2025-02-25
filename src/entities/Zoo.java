package entities;

public class Zoo {
    private Animal[] animals;
    private AnimalAquatique[] aquaticAnimals;
    private String name;
    private String city;

    private static final int NBR_CAGES = 25;
    private static final int NBR_AQUATIC = 10;
    private int aquaticCount = 0;

    public Zoo(String name, String city) {
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new AnimalAquatique[NBR_AQUATIC];
        setName(name);
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name == null || name.trim().isEmpty()) ? "Unnamed Zoo" : name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayZoo() {
        System.out.println(name + " - " + city + " (Capacité : " + NBR_CAGES + " animaux)");
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein !");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal est déjà dans le zoo.");
            return false;
        }
        for (int i = 0; i < NBR_CAGES; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
    }

    public boolean addAquaticAnimal(AnimalAquatique aquaticAnimal) {
        if (aquaticCount >= NBR_AQUATIC) {
            System.out.println("La section aquatique est pleine.");
            return false;
        }
        aquaticAnimals[aquaticCount++] = aquaticAnimal;
        System.out.println(aquaticAnimal.getName() + " ajouté à la section aquatique.");
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animaux du zoo :");
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    public void displayAquaticAnimals() {
        System.out.println("Animaux aquatiques dans le zoo :");
        for (int i = 0; i < aquaticCount; i++) {
            System.out.println(aquaticAnimals[i]);
        }
    }

    public void displaySwimmingActions() {
        System.out.println("Tous les animaux aquatiques nagent :");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < NBR_CAGES; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null;
            System.out.println(animal.getName() + " a été retiré du zoo.");
            return true;
        }
        return false;
    }

    public boolean isZooFull() {
        for (Animal animal : animals) {
            if (animal == null) {
                return false;
            }
        }
        return true;
    }

    public int getAnimalCount() {
        int count = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                count++;
            }
        }
        return count;
    }

    public static Zoo compareZoos(Zoo z1, Zoo z2) {
        if (z1.getAnimalCount() > z2.getAnimalCount()) {
            return z1;
        } else if (z2.getAnimalCount() > z1.getAnimalCount()) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null;
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", animaux=" + getAnimalCount() +
                ", aquatiques=" + aquaticCount +
                '}';
    }
}
