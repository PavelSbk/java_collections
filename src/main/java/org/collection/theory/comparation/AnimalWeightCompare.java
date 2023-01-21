package org.collection.theory.comparation;

import org.collection.model.Animal;

import java.util.Comparator;

public class AnimalWeightCompare implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}
