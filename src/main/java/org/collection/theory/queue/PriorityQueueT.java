package org.collection.theory.queue;

import org.collection.model.Student;

import java.util.*;

/**
 * Класс PriorityQueue был введен в Java 1.5 и является частью Java Collections Framework.
 * PriorityQueue является неограниченной очередью.
 * Элементы упорядочены по умолчанию в естественном порядке или же отсортированы с помощью компаратора.
 * PriorityQueue не позволяет добавлять null-значения и non-comparable объекты.
 * Размер приоритетной очереди (PriorityQueue) неограничен,
 * но мы можем указать начальный размер в момент его создания.
 * Когда мы добавляем элементы в приоритетную очередь, её размер увеличивается автоматически.
 * PriorityQueue не является потокобезопасной! Для этих целей в Java реализован класс PriorityBlockingQueue,
 * реализующий интерфейс BlockingQueue. Именно он используется в многопоточной среде.
 * В PriorityQueue добавление/удаление элементов происходит за время O(log(n)).
 * <p>
 * PriorityQueue - это отсортированная с помощью компоратора очередь, приоритет в корой
 * отдаётся элементу, который стоит выше всех.
 * <p>
 * Constructors:
 * <p>
 * 1. PriorityQueue():
 * Creates a PriorityQueue with the default initial capacity (11) that orders
 * its elements according to their natural ordering.
 * <p>
 * >> PriorityQueue<E> pq = new PriorityQueue<E>();
 * <p>
 * 2. PriorityQueue(Collection<E> c):
 * Creates a PriorityQueue containing the elements in the specified collection.
 * <p>
 * >> PriorityQueue<E> pq = new PriorityQueue<E>(Collection<E> c);
 * <p>
 * 3. PriorityQueue(int initialCapacity):
 * Creates a PriorityQueue with the specified initial capacity
 * that orders its elements according to their natural ordering.
 * <p>
 * >> PriorityQueue<E> pq = new PriorityQueue<E>(int initialCapacity);
 * <p>
 * 4. PriorityQueue(int initialCapacity, Comparator<E> comparator):
 * Creates a PriorityQueue with the specified initial capacity
 * that orders its elements according to the specified comparator.
 * <p>
 * >> PriorityQueue<E> pq = new PriorityQueue(int initialCapacity, Comparator<E> comparator);
 * <p>
 * 5. PriorityQueue(PriorityQueue<E> c):
 * Creates a PriorityQueue containing the elements in the specified priority queue.
 * <p>
 * >> PriorityQueue<E> pq = new PriorityQueue(PriorityQueue<E> c);
 * <p>
 * 6. PriorityQueue(SortedSet<E> c):
 * Creates a PriorityQueue containing the elements in the specified sorted set.
 * <p>
 * >> PriorityQueue<E> pq = new PriorityQueue<E>(SortedSet<E> c);
 */

public class PriorityQueueT {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(88);
        priorityQueue.add(11);
        priorityQueue.add(0);
        priorityQueue.add(3);
        priorityQueue.add(55);
        priorityQueue.add(1);
        System.out.println("=== Print PriorityQueue ===");
        System.out.println(priorityQueue);
        System.out.println("=== remove() ===");
        System.out.println(priorityQueue.remove());
        System.out.println("=== Print PriorityQueue ===");
        System.out.println(priorityQueue);
        System.out.println("=== remove() all 5 elements ===");
        for (int i = 0; i < 5; i++) {
            System.out.println(priorityQueue.remove());
        }
        System.out.println("=== Students ===");
        Student st1 = new Student("D", "Def", 4);
        Student st2 = new Student("C", "Cde", 3);
        Student st3 = new Student("B", "Bcd", 2);
        Student st4 = new Student("A", "Efg", 5);
        Student st5 = new Student("A", "Abc", 1);
        PriorityQueue<Student> students = new PriorityQueue<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.forEach(System.out::println);
        System.out.println("=== remove() the element ===");
        System.out.println(students.remove());

    }
}
