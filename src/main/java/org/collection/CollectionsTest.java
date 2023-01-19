package org.collection;

import org.collection.comparation.AnimalNameCompare;
import org.collection.model.Animal;
import org.collection.model.Classification;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * “Коллекции” — общее название для нескольких структур данных в Java
 * Collections и Collection разница:
 * <p>
 * java.util.Collections - класс, с набором статических методов для работы с коллекциями.
 * java.util.Collection - один из основных интерфейсов Java Collections Framework.
 * <p>
 * Класс java.util.Collections состоит исключительно из статических методов,
 * которые работают с коллекциями или возвращают их.
 * Ниже приведены важные замечания о коллекциях:
 * <p>
 * - Collections содержит полиморфные алгоритмы, которые работают с коллекциями,
 * «обертки», которые возвращают новую коллекцию, подкрепленную указанной коллекцией.
 * <p>
 * - все методы Collections генерируют исключение NullPointerException,
 * если предоставленные им коллекции или объекты класса имеют значение null.
 * <p>
 * - Collections содержит полиморфные алгоритмы,
 * которые работают с коллекциями, «обертки», которые возвращают новую коллекцию,
 * подкрепленную указанной коллекцией.
 */

public class CollectionsTest {

    public static void main(String[] args) {
        /**
         * sort(List<T> list) - сортирует в natural последовательности
         */
        System.out.println("=== Print List of integer ===");
        List<Integer> nums = Arrays.asList(-15, -19, -22, -11, -7, -3, 0, 55, 16, 21, 19, 34, 5);
        System.out.println(nums);
        System.out.println("=== Print reversed List of integer ===");
        Collections.reverse(nums);
        System.out.println(nums);
        System.out.println("=== Print shuffled List of integer ===");
        Collections.shuffle(nums);
        System.out.println(nums);
        System.out.println("=== Print sorted List of integer ===");
        Collections.sort(nums);
        System.out.println(nums);
        /**
         * binarySearch(List<? extends Comparable<? super T>> list, T key)
         * или
         * binarySearch(List<? extends T> list, T key, Comparator<? super T> c) - проводит бинарный поиск в коллекции
         * !Важно! перед началом поиска необходима сортировка по возрастанию
         * Сравниваться объекты будут согласно переопределённому методу public int compareTo(Animal o)
         * или согласно переданному компаратору
         */
        System.out.println("=== Print index of 16 in List of integer ===");
        System.out.println(Collections.binarySearch(nums, 16));
        System.out.println("=== Print List of animals ===");
        List<Animal> animalList = Arrays.asList(
                new Animal("Гиена", 11, 33.5, Classification.PREDATOR),
                new Animal("Собака", 5, 32.3, Classification.OMNIVOROUS),
                new Animal("Гиена", 9, 31, Classification.PREDATOR),
                new Animal("Жираф", 15, 790.2, Classification.HERBIVORE),
                new Animal("Слон", 21, 2100, Classification.HERBIVORE)
        );
        animalList.forEach(System.out::println);
        System.out.println("=== Print List of animals sorted by age ===");
        animalList.sort(new AnimalNameCompare());
        animalList.forEach(System.out::println);
        System.out.println("=== Print index of animals sorted by name ===");
        System.out.println(Collections.binarySearch(animalList,
                new Animal("Собака", 5, 32.3, Classification.OMNIVOROUS), new AnimalNameCompare()));
        System.out.println("=== Print array of integer ===");
        List<Integer> nums2 = Arrays.asList(-15, -19, -22, -11, -7, -3, 0, 55, 16, 21, 19, 34, 5);
        Integer[] arr = nums2.toArray(new Integer[13]);
        System.out.println(Arrays.toString(arr));
        System.out.println("=== Print array sorted by natural order ===");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("=== Print index of 19 from array sorted by natural order ===");
        System.out.println(Arrays.binarySearch(arr, 19));
    }
}
