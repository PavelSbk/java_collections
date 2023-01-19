package org.collection.list;

import org.collection.model.Student;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList — класс, реализующий два интерфейса — List и Deque
 * В Java реализован doubly linked list (двусторонний), в котором каждая ячейка имеет ссылку на
 * ячейку (или null) слева и справа от себя.
 * Это обеспечивает возможность создания двунаправленной очереди из любых (в том числе и null) элементов.
 * Каждый объект, помещенный в связанный список, является узлом (нодом).
 * Каждый узел содержит элемент, ссылку на предыдущий и следующий узел.
 * Фактически связанный список состоит из последовательности узлов,
 * каждый из которых предназначен для хранения объекта определенного при создании типа.
 *
 * Структура LinkedList:
 *
 *  null <-- x x x x  <-- x x x x  <--  x x x x
 *           x  A  x      x  B  x       x  C  x
 *           x x x x  --> x x x x  -->  x x x x  ==> null
 *              0            1             2
 *            HEAD                       TAIL
 *
 * HEAD - начало LinkedList, т.к. слева от него null
 * TAIL - конец LinkedList, т.к. справа от него null
 *
 * Минусы:
 * - медленное выполнение метода get
 * Для того, чтобы получить элемент в списке, java проходит по всем элементом
 * начиная с 0 или с конца (linkedList.size() - 1), в зависимости от того,
 * откуда ближе до искомого элемента
 *
 * Плюсы:
 * При удалении или вставке элемента в LinkedList происходит простая смена ссылок,
 * где новый элемент начинает ссылаться на элементы, между которыми его вставили.
 *
 * Элементы LinkedList - это звенья одной цепи. эти звенья хранят определённые данные,
 * а также ссылки на предыдущий и следующий элемент.
 * Создание связанного списка:
 * List<Integer> numbers = new LinkedList<>();
 *
 * Область применения LinkedList:
 * LinkedList хорошо подходит для работы с коллекциями, при которой чаще всего происходят изменения,
 * связанные с удалением или добавлением элементов, особенно в начале или конце коллекции
 */

public class LinkedListMethods {

    public static void main(String[] args) {
        Student st1 = new Student("Aa", 1);
        Student st2 = new Student("Bb", 2);
        Student st3 = new Student("Cc", 3);
        Student st4 = new Student("Dd", 4);
        Student st5 = new Student("Ee", 5);
        Student st6 = new Student("Ab", 2);
        Student st7 = new Student("Bc", 1);
        List<Student> studentList = new LinkedList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println("=== New List ===");
        studentList.forEach(System.out::println);
        System.out.println("=== Print Index 2 ===");
        System.out.println(studentList.get(2));
        System.out.println("=== Expanded List .add(index 1, element) ===");
        studentList.add(1, st7);
        studentList.forEach(System.out::println);
        /** ADD
         * В отличие от массива, при вставлении элемента в LinkedList происходит простая смена ссылок,
         * гда новый эллемент начинает ссылаться на элементы, между которыми его вставили.
         * В массиве же, произошел бы здвиг всех элементов вправо с возможным разширением capacity
         */
        System.out.println("=== Expanded List .remove(index 3) ===");
        studentList.remove(3);
        studentList.forEach(System.out::println);
        /** REMOVE
         * Изъятый элемент не удаляется из памяти, он просто теряет ссылочную связь с соседними элементами
         */
    }
}
