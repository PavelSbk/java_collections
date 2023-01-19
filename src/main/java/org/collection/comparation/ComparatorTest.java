package org.collection.comparation;

import org.collection.model.Animal;
import org.collection.model.Classification;

import java.util.Arrays;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        System.out.println("=== Print Animal List ===");
        List<Animal> animalList = Arrays.asList(
                new Animal("Гиена", 11, 33.5, Classification.PREDATOR),
                new Animal("Гибон", 25, 32.3, Classification.OMNIVOROUS),
                new Animal("Гиена", 12, 31, Classification.PREDATOR),
                new Animal("Жираф", 12, 790.2,Classification.HERBIVORE)
        );
        animalList.forEach(System.out::println);
        System.out.println("=== Print Animal List sorted with names ===");
        /**
         * Создаётся класс AnimalNameCompare() с имплементацией Comparator<Animal>
         * в классе переопределяется метод public int compare(Animal o1, Animal o2) так,
         * чтобы сравнивались необходимые параметры
         */
        animalList.sort(new AnimalNameCompare());
        animalList.forEach(System.out::println);
        System.out.println("=== Print Animal List sorted with weight ===");
        animalList.sort(new AnimalWeightCompare());
        animalList.forEach(System.out::println);
    }
}
