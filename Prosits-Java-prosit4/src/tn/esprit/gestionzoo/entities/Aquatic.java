package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic objet = (Aquatic) obj;
        return this.getName().equals(objet.getName()) && this.getAge() == objet.getAge() && this.habitat.equals(objet.habitat);
    }

}


