package org.collection.theory.map;

import org.collection.model.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap — основан на хэш-таблицах,
 * реализует интерфейс Map (что подразумевает хранение данных в виде пар ключ/значение).
 * Ключи и значения могут быть любых типов, в том числе null
 *
 * В основе HashMap лежит массив. Элементами данного массива являются структуры LinkedList.
 * Данные структуры LinkedList и заполняются элементами, которые мы добавляем в HashMap.
 *
 * !!! Ключ (key) должен быть уникальным иначе IllegalArgumentException : duplicate key
 * !!! Значение (value) может повторяться
 *
 * Данная реализация не дает гарантий относительно порядка элементов с течением времени,
 * т.е. не запоминает порядок добавления элементов.
 * Разрешение коллизий осуществляется с помощью метода цепочек.
 *
 * HashMap быстро работает,
 * и большинство операций в нем выполняется за фиксированное время —
 * это происходит благодаря оптимизированному доступу к данным.
 * Как и практически все структуры из Collections Framework,
 * он динамический, то есть его размер не фиксирован —
 * туда можно добавить практически любое количество объектов.
 *
 * Для оптимизации доступа к элементу используется хэш ключ.
 * Когда в HashMap добавляют ключ и значение, для ключа сразу высчитывается хэш.
 * По нему определяется позиция в массиве для этой пары: для расчета есть специальные формулы.
 *
 * HashMap — структура из пар «ключ-значение». Внутри это динамический массив ключей.
 * Каждый элемент массива — своеобразная «корзинка», которая хранит связанный список со значением.
 *
 * Создание объекта:
 * Map<String, String> hashmap = new HashMap<String, String>();
 */

public class HashMapTest {

    public static void main(String[] args) {
        /** PUT
         * Добавление элементов:
         * Самый примитивный, многословный, но простой способ – добавить элементы сразу после создания.
         * Для мапы - поля класса это можно сделать в конструкторе или блоке инициализации.
         * Map<String, String> map = new HashMap<>();
         * {
         *     map.put("one", "first");
         *     map.put("two", "second");
         * }
         * В Java 9 появились фабричные метод Map.of(),
         * перегруженный для разного количества пар параметров, и Map.ofEntries() с varargs-аргументом.
         * !!! В этом случае Map становится immutable !!!
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(1234, "P Sbk");
        map.put(1235, "B Bob");
        map.put(3214, "G Ubr");
        map.put(5423, null);
        map.put(2456, "A Abc");
        map.put(2236, "B Bob");
        map.put(null, "N Nul");
        System.out.println("=== New Map ===");
        map.forEach((i, s) -> System.out.println(i + " " + s));

        /** PUT IF ABSENT
         * default V putIfAbsent(K key, V value) - добавляет элемент в коллекцию, если такого нет
         */
        System.out.println("=== putIfAbsent 3333, \"G Bls\" and 2456, \"A Abc\" ===");
        map.putIfAbsent(3333, "G Bls");
        map.putIfAbsent(2456, "A Abc");
        map.forEach((i, s) -> System.out.println(i + " " + s));

        /** GET
         * V get(Object key) - вернёт значение при ключе key
         */
        System.out.println("=== Get key 1234 ===");
        System.out.println(map.get(1234));

        /** CONTAINS VALUE
         * boolean containsValue(Object value) - true, если значение есть в мапе
         */
        System.out.println("=== Does \"G Bls\" contains in? ===");
        System.out.println(map.containsValue("G Bls"));

        /** CONTAINS KEY
         * boolean containsKey(Object key) - true, если ключ есть в мапе
         */
        System.out.println("=== Does 6666 contains in? ===");
        System.out.println(map.containsKey(6666));

        /** KEY SET
         * Set<K> keySet() - вернёт Set<key> ключей мапы
         */
        System.out.println("=== Print all keys in map ===");
        System.out.println(map.keySet());

        /** VALUES
         * Collection<V> values() - вернёт коллекцию значений мапы
         */
        System.out.println("=== Print all values in map ===");
        System.out.println(map.values());

        /** ENTRY SET
         * interface Entry<K, V> {
         *         /**
         *          * Returns the key corresponding to this entry.
         *          * @return the key corresponding to this entry
         *          * @throws IllegalStateException implementations may, but are not
         *          *         required to, throw this exception if the entry has been
         *          *         removed from the backing map.
         */
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
