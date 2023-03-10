package org.collection.model;

import java.util.Objects;

/**
 * Need of Object Oriented Data Model :
 * To represent the complex real world problems there was a need
 * for a data model that is closely related to real world.
 * Object Oriented Data Model represents the real world problems easily.
 * <p>
 * Object Oriented Data Model :
 * In Object Oriented Data Model,
 * data and their relationships are contained in a single structure which
 * is referred as object in this data model.
 * In this, real world problems are represented as objects with different attributes.
 * All objects have multiple relationships between them.
 * Basically, it is combination of Object Oriented programming
 * and Relational Database Model as it is clear from the following figure :
 */

public class Animal implements Comparable<Animal> {

    private String name;
    private int age;
    private double weight;
    private Classification classification;

    public Animal() {
    }

    public Animal(String name, int age, double weight, Classification classification) {
        this.name = name;
        this.age = age;
        this.classification = classification;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public Classification getClassification() {
        return classification;
    }

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(age, o.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return getAge() == animal.getAge()
                && getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getClassification());
    }

    @Override
    public String toString() {
        return "Animal {"
                +
                "name = '" + name + '\''
                +
                ", age = " + age
                +
                ", weight = " + weight
                +
                ", classification = " + classification
                +
                '}';
    }
}

// new Animal("????????", 20, Classification.HERBIVORE),
// new Animal("??????", 10, Classification.PREDATOR),
// new Animal("??????????", 11, Classification.PREDATOR),
// new Animal("??????????", 20, Classification.HERBIVORE),
// new Animal("??????????", 35, Classification.OMNIVOROUS),
// new Animal("??????????", 27, Classification.OMNIVOROUS),
// new Animal("????????????", 36, Classification.HERBIVORE),
// new Animal("????????", 2, Classification.HERBIVORE),
// new Animal("????????", 10, Classification.PREDATOR),
// new Animal("????????", 8, Classification.PREDATOR),
// new Animal("????????????????", 200, Classification.PREDATOR)
