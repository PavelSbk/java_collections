package org.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Set - множество уникальных элементов.
 * Set - это интерфейс, расширяющий Collection, не позволяющий хранить повторяющиеся элементы.
 * <p>
 * В основе HashSet лежит HashMap, где HashSet - это ключ, а value - заглушка
 *
 * Обобщенный класс HashSet представляет хеш-таблицу и по сути является хранилищем ключей в Map:
 * - в основе имеет TABLE из 16 элементов (0 - 15)
 * - не придерживается порядка добавления элементов
 * - может расширяться и производить rehashing элементов
 *
 * Он наследует свой функционал от класса AbstractSet, а также реализует интерфейс Set.
 *
 * Для создания объекта HashSet можно воспользоваться одним из следующих конструкторов: *
 * HashSet(): создает пустой список
 * HashSet(Collection<? extends E> col): создает хеш-таблицу, в которую добавляет все элементы коллекции col.
 * HashSet(int capacity): параметр capacity указывает начальную емкость таблицы, которая по умолчанию равна 16.
 * HashSet(int capacity, float koef): параметр koef или коэффициент заполнения, значение которого должно быть
 * в пределах от 0.0 до 1.0, указывает,
 * насколько должна быть заполнена емкость объектами прежде чем произойдет ее расширение.
 * Например, коэффициент 0.75 указывает, что при заполнении емкости на 3/4 произойдет ее расширение.
 */

public class HashSetMethods {

    public static void main(String[] args) {
        Set<String> setAdder = Set.of(
                "Public Sbk",
                "Oleg Obg",
                "Marina Mrn",
                "Olga Olg"
        );
        Set<String> set = new HashSet<>(setAdder);
        System.out.println("===== Print new HashSet =====");
        set.forEach(System.out::println);

        /** ADD
         * boolean add(E e) - Adds the specified element to this set if it is not already present.
         */
        System.out.println("===== Add Ivan Ivn and print =====");
        set.add("Ivan Ivn");
        set.forEach(System.out::println);
        System.out.println("===== Add Oleg Obg and print =====");
        set.add("Oleg Obg");
        set.forEach(System.out::println);

        /** REMOVE
         * boolean remove(Object o) - removes the specified element from this set if it is present.
         */
        System.out.println("===== Remove Oleg Obg and print =====");
        set.remove("Oleg Obg");
        set.forEach(System.out::println);
        System.out.println("===== Print new HashSet1 and HashSet2 of Integers =====");
        System.out.println("HashSet1: ");
        Set<Integer> intSet1 = Set.of(5, 2, 3, 1, 8);
        Set<Integer> hashSet1 = new HashSet<>(intSet1);
        hashSet1.forEach(System.out::println);
        System.out.println("HashSet2: ");
        Set<Integer> intSet2 = Set.of(7, 4, 3, 5, 8);
        Set<Integer> hashSet2 = new HashSet<>(intSet2);
        hashSet2.forEach(System.out::println);

        /** ADD ALL
         * Set method - boolean addAll(Collection<? extends E> c) - Adds all of the elements
         * in the specified collection to this set if they're not already present (optional operation).
         */
        System.out.println("===== Print unity of HashSet1 and HashSet2 of Integers =====");
        Set<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        union.forEach(System.out::println);

        /** RETAIN ALL
         * Set method - boolean retainAll(Collection<?> c) - retains only the elements in this set
         * that are contained in the specified collection (optional operation).
         */
        System.out.println("===== Print intersect of HashSet1 and HashSet2 of Integers =====");
        Set<Integer> retain = new HashSet<>(hashSet1);
        retain.retainAll(hashSet2);
        retain.forEach(System.out::println);

        /** REMOVE ALL
         * Set method - boolean removeAll(Collection<?> c) - removes from this set all of its elements
         * that are contained in the specified collection (optional operation).
         */
        System.out.println("===== Print subtract of HashSet1 and HashSet2 of Integers =====");
        Set<Integer> subtract = new HashSet<>(hashSet1);
        subtract.removeAll(hashSet2);
        subtract.forEach(System.out::println);
    }
}
