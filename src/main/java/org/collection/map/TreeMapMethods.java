package org.collection.map;

import org.collection.model.Student;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap — это Map с автоматически сортированными помещённых в неё парами.
 * Создание:
 * TreeMap<K, V> treeMap = new TreeMap<>();
 * Где использовать?
 * !!! TreeMap стоит использовать там, где важен порядок хранения объектов !!!
 * В основном, TreeMap используется для нахождения отрезков ranges
 * благодаря методам headMap(), subMap(), tailMap().
 * <p>
 * !!! В качестве ключа НЕВОЗМОЖНО использовать класс, не имплементирующий Интерфейс Comparable !!!
 * В этом случае создание TreeMap должно быть с передачей компоратора:
 * Map<K, V> treeMap = new TreeMap<>(new Comparator<>());
 * <p>
 * TreeMap реализует Map, NavigableMap, а также SortedMap интерфейс.
 * <p>
 * TreeMap реализован как красно-черное дерево пример:
 *
 *                            5
 *                          /   \
 *                         /     \
 *                        4      7
 *                      /  \    / \
 *                     2    3  6   9
 *                         и т.д.
 *
 * TreeMap, повторяется в соответствии с естественным порядком его ключей
 * или в соответствии с Компаратором, указанным во время создания карты.
 * !!! Производительность TreeMap - O(log(n)) бинарный поиск
 * <p>
 * TreeMap разрешает только нулевые значения (не нулевые ключи),
 * если используется естественный порядок ключей.
 * Он поддерживает нулевые ключи только в том случае,
 * если его компаратор поддерживает сравнение нулевых ключей.
 */

public class TreeMapMethods {

    public static void main(String[] args) {
        System.out.println("===== New TreeMap =====");
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("A", "Abc", 1);
        Student st2 = new Student("B", "Bcd", 2);
        Student st3 = new Student("C", "Cde", 3); //
        Student st4 = new Student("D", "Def", 4);
        Student st5 = new Student("A", "Efg", 5);
        Student st6 = new Student("F", "Cde", 5);
        Student st7 = new Student("G", "Bcd", 5);
        Student st8 = new Student("C", "Cde", 3); //
        Student st9 = new Student("Z", "Zwx", 3);

        /** PUT
         * put(K, V) - размещает элемент в TreeMap
         */
        treeMap.put(6.4, st2);
        treeMap.put(9.1, st7);
        treeMap.put(7.2, st3);
        treeMap.put(7.9, st5);
        treeMap.put(7.5, st4);
        treeMap.put(8.8, st1);
        treeMap.put(8.2, st6);
        treeMap.put(4.3, st8);
        treeMap.put(4.3, st9);
        treeMap.forEach((k, v) -> System.out.println(k + " : " + v));

        /** GET
         * -> V get(Object key) - вернёт значение по ключу
         */
        System.out.println("===== Get by key 7.5 =====");
        System.out.println(treeMap.get(7.5));

        /** REMOVE
         * -> V remove(Object key) - вернёт удаляемый объект и удалит из TreeMap
         */
        System.out.println("===== Remove by key 7.9 =====");
        System.out.println(treeMap.remove(7.9) + " deleted:");
        treeMap.forEach((k, v) -> System.out.println(k + " : " + v));

        /** DESCENDING MAP
         * -> NavigableMap<K,V> descendingMap() - возвращает view TreeMap в обратном порядке по ключам
         */
        System.out.println("==== Descending Map ====");
        treeMap.descendingMap().forEach((k, v) -> System.out.println(k + " : " + v));

        /** TAIL MAP
         * -> SortedMap<K,V> tailMap(K fromKey) - вернёт представление участка TreeMap,
         * ключи которого больше или включают K fromKey
         * -> NavigableMap<K,V> tailMap(K fromKey, boolean inclusive) - вернёт представление участка TreeMap,
         * ключи которого больше или при разрешении в boolean inclusive включают K fromKey
         */
        System.out.println("==== Print tail from 8.2 including 8.2 (ex)) ====");
        treeMap.tailMap(8.2, false).forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("==== Print tail from 8.2 including 8.2 (inc)) ====");
        treeMap.tailMap(8.2).forEach((k, v) -> System.out.println(k + " : " + v));

        /** HEAD MAP
         * -> SortedMap<K,V> headMap(K toKey) - вернёт представление участка TreeMap,
         * ключи которого меньше или включают K fromKey
         * -> NavigableMap<K,V> headMap(K toKey, boolean inclusive) - вернёт представление участка TreeMap,
         * ключи которого меньше или при разрешении в boolean inclusive включают K fromKey
         */
        System.out.println("==== Print head from 8.2 including 8.2 (ex)) ====");
        treeMap.headMap(8.2, false).forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("==== Print head from 8.2 including 8.2 (inc) ====");
        treeMap.headMap(8.2).forEach((k, v) -> System.out.println(k + " : " + v));

        /** SUB MAP
         * -> SortedMap<K,V> subMap(K fromKey, K toKey) - вернёт view участка TreeMap
         * от [K fromKey (включительно) до K toKey (не включая)
         * -> NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) -
         * вернёт view участка TreeMap от
         * [K fromKey до K toKey] или
         * (K fromKey до K toKey) или
         * [K fromKey до K toKey) или
         * (K fromKey до K toKey] или
         * в зависимости от boolean fromInclusive и boolean toInclusive
         */
        System.out.println("==== Print from 7.2 to 8.2 ====");
        treeMap.subMap(7.2, 8.2).forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("==== Print from 7.2 (inc) to 8.2 (inc)====");
        treeMap.subMap(7.2, true, 8.2, true)
                .forEach((k, v) -> System.out.println(k + " : " + v));

        /** LAST ENTRY
         * -> Map.Entry<K,V> lastEntry() - вернёт последнее значение в TreeMap или null
         */
        System.out.println("==== Print the last element in TreeMap ====");
        System.out.println(treeMap.lastEntry());

        /** LAST ENTRY
         * -> Map.Entry<K,V> firstEntry() - вернёт первое значение в TreeMap или null
         */
        System.out.println("==== Print the first element in TreeMap ====");
        System.out.println(treeMap.firstEntry());
        System.out.println("==== Print TreeMap2 ====");
        Map<Student, Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().equals(o2.getName())
                        && o1.getSurname().equals(o2.getSurname())) {
                    return Integer.compare(o1.getCourse(), o2.getCourse());
                }
                if (o1.getName().equals(o2.getName())) {
                    return o1.getSurname().compareTo(o2.getSurname());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        treeMap2.put(st2, 6.4);
        treeMap2.put(st7, 9.1);
        treeMap2.put(st3, 7.2);
        treeMap2.put(st5, 7.9);
        treeMap2.put(st4, 7.5);
        treeMap2.put(st1, 8.8);
        treeMap2.put(st6, 8.2);
        treeMap2.put(st8, 4.3);
        treeMap2.put(st9, 4.3);
        treeMap2.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("==== Does treeMap2 contains st8?");
        System.out.println(treeMap2.containsKey(st8));
        System.out.println(treeMap2.get(st8));
        System.out.println("==== Does treeMap2 contains st3?");
        System.out.println(treeMap2.containsKey(st3));
        System.out.println(treeMap2.get(st3));
        System.out.println("==== Does st3 is equals st8?");
        System.out.println(st3.equals(st8));
    }
}
