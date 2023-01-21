package org.collection.theory.set;

import org.collection.model.Student;

import java.util.Set;
import java.util.TreeSet;

/**
 * В основе TreeSet лежит TreeMap, где HashSet - это ключ, а value - заглушка
 * <p>
 * null:
 * TreeSet не может хранить null - NullPointerExeption
 * <p>
 * !!! Важно !!! В TreeSet можно поместить только comparable объекты, либо передать в конструктор компоратор,
 * иначе ClassCastException
 * <p>
 * Класс TreeSet в Java обеспечивает реализацию интерфейса Set,
 * который использует древо для хранения. Объекты хранятся в отсортированном и возрастающем порядке.
 * <p>
 * Доступ и поиск элементов TreeSet происходит довольно быстро,
 * что делает TreeSet отличным выбором при хранении большого количества отсортированной информации,
 * которая должна быть найдена быстро.
 * <p>
 * Конструктор и описание:
 * TreeSet() - создает пустое дерево, которое будет сортироваться в порядке возрастания
 * в соответствии с естественным порядком его элементов.
 * TreeSet(Collection c) - конструктор создает набор деревьев, содержащий элементы коллекции c.
 * TreeSet(Comparator comp) - конструктор создает пустой набор деревьев,
 * который будет сортироваться в соответствии с данным компаратором.
 * TreeSet(SortedSet ss) - конструктор создает TreeSet, который содержит элементы данного SortedSet.
 */

public class TreeSetMethods {

    public static void main(String[] args) {
        Set<Integer> setFilling = Set.of(1, 5, 15, 23, 0, 6, 11);
        Set<Integer> treeSet = new TreeSet<>(setFilling);
        System.out.println("===== Print new TreeSet =====");
        treeSet.forEach(System.out::println);

        /** ADD
         * void add(Object o)- добавляет указанный элемент к этому набору, если он еще не присутствует.
         */
        System.out.println("===== Add 77 in to the TreeSet =====");
        treeSet.add(77);
        treeSet.forEach(System.out::println);

        /** CONTAINS
         * boolean contains(Object o) - возвращает true, если этот набор содержит указанный элемент.
         */
        System.out.println("===== Does TreeSet contains 11? =====");
        System.out.println(treeSet.contains(11));
        System.out.println("===== Print new TreeSet of students =====");
        Set<Student> studentsSet = Set.of(
                new Student("C", "Cde", 3),
                new Student("B", "Bcd", 2),
                new Student("A", "Abc", 1),
                new Student("D", "Def", 4)
        );
        TreeSet<Student> students = new TreeSet<>(studentsSet);
        students.forEach(System.out::println);
        /** FIRST
         * Object first() - возвращает первый (самый низкий) элемент, находящийся в этом отсортированном наборе.
         */
        System.out.println("===== Print the first student =====");
        System.out.println(students.first());

        /** LAST
        * Object last() - возвращает последний (самый высокий) элемент, находящийся в этом отсортированном наборе.
        */
        System.out.println("===== Print the last student =====");
        System.out.println(students.last());

        /** HEAD SET
         * SortedSet headSet(Object toElement) - возвращает представление (вид) части этого набора,
         * элементы которого строго меньше, чем toElement.
         */
        System.out.println("==== Print students who are lower than new Student(\"A\", \"Efg\", 5) ====");
        students.headSet(new Student("A", "Efg", 5)).forEach(System.out::println);
        /** TAIL SET
         * SortedSet tailSet(Object fromElement) - возвращает представление (вид) части этого набора,
         * элементы которого больше или равны fromElement.
         */
        System.out.println("==== Print students who are higher than new Student(\"A\", \"Efg\", 5) ====");
        students.tailSet(new Student("A", "Efg", 5)).forEach(System.out::println);
        /** SUB SET
         * SortedSet subSet(Object fromElement, Object toElement) - возвращает представление (вид) части этого набора,
         *  элементы которого варьируются от fromElement, включительно, до toElement, исключительно.
         */
        System.out.println("==== Print students from (A to D) ====");
        students.subSet(new Student("A", "Abc", 1), false,
                new Student("D", "Def", 4), false)
                .forEach(System.out::println);
        /**
         * boolean addAll(Collection c) - добавляет все элементы в указанной коллекции к этому набору.
         * void clear() - удаляет все элементы из этого набора.
         * Object clone()- возвращает мелкую копию этого экземпляра TreeSet.
         * Comparator comparator() - возвращает компаратор, используемый для порядка этого отсортированного набора,
         * или null (нуль), если этот набор деревьев использует свои элементы естественного упорядочения.
         * boolean isEmpty() - возвращает true, если этот набор не содержит элементов.
         * Iterator iterator() - возвращает итератор над элементами этого набора.
         * boolean remove(Object o) - удаляет указанный элемент из этого набора, если он присутствует.
         * int size() - возвращает количество элементов в этом наборе (его мощность).
         */

    }
}
