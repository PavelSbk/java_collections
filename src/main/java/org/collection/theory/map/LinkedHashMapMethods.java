package org.collection.theory.map;

import org.collection.model.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap - является наследником HashMap. *
 * public class LinkedHashMap<K,V>
 *     extends HashMap<K,V>
 *     implements Map<K,V>
 *
 * Хранит информацию о порядке добавления элементов или порядке их использования.
 * Производительность методов LinkedHashMap немного ниже чем у HashMap.
 *
 * Только что созданный объект linkedHashMap,
 * помимо свойств унаследованных от HashMap (такие, как table, loadFactor, threshold, size, entrySet и т.п.),
 * так же содержит два доп. свойства:
 * header — «голова» двусвязного списка. При инициализации указывает сам на себя;
 * accessOrder — указывает каким образом будет осуществляться доступ к элементам при использовании итератора;
 *
 * Создание объекта:
 * Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
 * Создание объекта с параметрами:
 * public LinkedHashMap(Map<? extends K, ? extends V> m);
 * Создание объекта с параметрами:
 * public LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
 * int initialCapacity - (def 16 or 0 - 15)
 * float loadFactor - (def 0.75f)
 * boolean accessOrder:
 * true - порядок будет меняться в зависимости от использования элементов,
 * элементы с которыми производились операции, переместятся в конец мапы
 * false - порядок добавления элементов (default)
 *
 * Добавление элементов:
 * При добавлении элемента, первым вызывается метод createEntry(hash, key, value, bucketIndex)
 * (по цепочке put() -> addEntry() -> createEntry())
 *
 * Полезные ссылки:
 * https://habr.com/ru/post/129037/
 */

public class LinkedHashMapMethods {

    public static void main(String[] args) {
        Student st1 = new Student("A", "Abc", 1);
        Student st2 = new Student("B", "Bcd", 2);
        Student st3 = new Student("C", "Cde", 3);
        Student st4 = new Student("D", "Def", 4);
        Map<Double, Student> stMap = Map.of(
                7.2, new Student("A", "Abc", 1),
                5.8, new Student("B", "Bcd", 2),
                7.5, new Student("C", "Cde", 3),
                6.4, new Student("D", "Def", 4)
        );
        Map<Double, Student> lhm = new LinkedHashMap<>(stMap);
        lhm.forEach((k, v )-> System.out.println(k + " : " + v));

    }
}
