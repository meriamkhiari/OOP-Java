package entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    static final int NBR_CAGES = 25;

    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        setName(name);
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name is empty");
            this.name = "Unnamed Zoo"; // Ensure the name is not null
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayZoo() {
        System.out.println(name + " " + city + " " + NBR_CAGES);
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < NBR_CAGES; i++) {
            if (animals[i] == null) {
                if (searchAnimal(animal) != -1) {
                    System.out.println("Animal already exists");
                    return false;
                }
                if (isZooFull()) {
                    System.out.println("Zoo is full");
                }
                animals[i] = animal;
                return true;
            }
        }
        System.out.println("Zoo full");
        return false;
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
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
        for (int i = 0; i < NBR_CAGES; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                animals[i] = null;
                System.out.println("Animal tfassakh");
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull() {
        for (int i = 0; i < NBR_CAGES; i++) {
            if (animals[i] == null) {
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

    // Méthode pour comparer deux zoos et retourner celui qui a le plus d'animaux
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getAnimalCount() > z2.getAnimalCount()) {
            return z1;
        } else if (z2.getAnimalCount() > z1.getAnimalCount()) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null;
        }
    }

    @Override
    public String toString() {
        return name + " " + city + " " + NBR_CAGES;
    }
}
