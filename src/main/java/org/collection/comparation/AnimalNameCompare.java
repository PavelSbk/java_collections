package org.collection.comparation;

import org.collection.model.Animal;

import java.util.Comparator;

public class AnimalNameCompare implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
