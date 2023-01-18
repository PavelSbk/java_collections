package org.collection.model;

import java.util.List;
import java.util.Objects;

/**
 * Need of Object Oriented Data Model :
 * To represent the complex real world problems there was a need
 * for a data model that is closely related to real world.
 * Object Oriented Data Model represents the real world problems easily.
 *
 * Object Oriented Data Model :
 * In Object Oriented Data Model,
 * data and their relationships are contained in a single structure which
 * is referred as object in this data model.
 * In this, real world problems are represented as objects with different attributes.
 * All objects have multiple relationships between them.
 * Basically, it is combination of Object Oriented programming
 * and Relational Database Model as it is clear from the following figure :
 */

public class Animal {

    private String name;
    private int age;
    private Classification classification;

    public Animal() {
    }

    public Animal(String name, int age, Classification classification) {
        this.name = name;
        this.age = age;
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Classification getClassification() {
        return classification;
    }

    public List<Animal> getAnimals() {
        return List.of(
                new Animal("Слон", 20, Classification.HERBIVORE),
                new Animal("Лев", 10, Classification.PREDATOR),
                new Animal("Гиена", 11, Classification.PREDATOR),
                new Animal("Жираф", 20, Classification.HERBIVORE),
                new Animal("Гибон", 35, Classification.OMNIVOROUS),
                new Animal("Гибон", 27, Classification.OMNIVOROUS),
                new Animal("Лошадь", 36, Classification.HERBIVORE),
                new Animal("Мышь", 2, Classification.HERBIVORE),
                new Animal("Рысь", 10, Classification.PREDATOR),
                new Animal("Рысь", 8, Classification.PREDATOR),
                new Animal("Динозавр", 200, Classification.PREDATOR)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return getAge() == animal.getAge()
                && getName().equals(animal.getName())
                && getClassification() == animal.getClassification();
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
                ", classification = " + classification
                +
                '}';
    }
}
