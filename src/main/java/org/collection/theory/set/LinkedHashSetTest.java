package org.collection.theory.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Класс LinkedHashSet языка Java расширяет HashSet, не добавляя никаких новых методов.
 * LinkedHashSet поддерживает связный список элементов набора в том порядке, в котором они вставлялись.
 * Это позволяет организовать упорядоченную итерацию вставки в набор.
 * Но это приводит к тому что класс LinkedHashSet выполняет операции дольше чем класс HashSet.
 *
 * В основе LinkedHashSet лежит HashMap, где элемент LinkedHashSet - это ключ, а value - константа-заглушка
 * public class LinkedHashSet<E>
 *       extends HashSet<E>
 *       implements Set<E>, Cloneable, java.io.Serializable
 *
 */

public class LinkedHashSetTest {

    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet<>();
    }
}
