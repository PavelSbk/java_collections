package org.collection.comparation;

import org.collection.model.Animal;
import org.collection.model.Classification;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Интерфейс Comparable
 * С английского "Comparable" переводится как "сравнимый".
 * Имплементируя этот интерфейс мы как бы говорим
 * "Эй, теперь объекты этого класса можно сравнивать между собой! И я знаю, как это сделать!"
 * <p>
 * public interface Comparable<T> {
 * <p>
 * public int compareTo(T o);
 * <p>
 * }
 * <p>
 * public int compareTo(T o) - единственный метод интерфейса, он возвращает:
 * ноль, если два объекта равны;
 * число > 0, если первый объект (на котором вызывается метод) больше,
 * чем второй (который передается в качестве параметра);
 * число < 0, если первый объект меньше второго.
 */

public class ComparableTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "C", "B", "A");
        System.out.println("=== Print List ===");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("=== Print sorted List with Collections.sort() ===");
        System.out.println(list);
        System.out.println("=== Print Animal List ===");
        List<Animal> animalList = Arrays.asList(
                new Animal("Гиена", 11, 33.5, Classification.PREDATOR),
                new Animal("Гибон", 25, 32.3, Classification.OMNIVOROUS),
                new Animal("Гиена", 12, 31, Classification.PREDATOR),
                new Animal("Жираф", 12, 790.2,Classification.HERBIVORE)
        );
        animalList.forEach(System.out::println);
        System.out.println("=== Print sorted Animal List with Collections.sort() ===");
        /**
         * !Внимание! Collections.sort(animalList) - такая сортировка невозможна, так как
         * у объекта класса Animal больше одного параметра, java не имеет условий,
         * согласно которым будет происходить сортировка
         * !Внимание! Arrays.sort() - выкинет ClassCastExeption
         */
        /**
         * В классе Animal имплементируем Interface Comparable<>
         * и переопределяем метод public int compareTo(T o) так,
         * чтобы он возвращал разницу между id (int):
         * Integer.compare(o1.getAge(), o2.getAge())
         * чтобы он возвращал разницу между name (String):
         * o1.getName.compareTo(o2.getName)
         */
        Collections.sort(animalList);
        animalList.forEach(System.out::println);
    }
}
