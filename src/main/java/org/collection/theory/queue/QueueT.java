package org.collection.theory.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue (очередь) — коллекция, используемая для хранения нескольких элементов перед обработкой.
 * Помимо базовых операций сбора, очередь обеспечивает дополнительные операции вставки, извлечения и проверки.
 * Очереди обычно, но не обязательно,
 * упорядочивают элементы в порядке FIFO (first-in-first-out — первым вошел — первым вышел).
 *
 * Элемент добавляется в конец очереди, забирается из начала очереди.
 * LinkedList имплементируют Dequeue -> Queue
 *
 * offer() - вставляет элемент в очередь, если это не удалось - возвращает false.
 * Этот метод отличается от метода add() интерфейса Collection тем,
 * что метод add() может неудачно добавить элемент только с использованием unchecked исключения.
 *
 * remove() и poll() - удаляют верхушку очереди и возвращают ее.
 * Какой элемент будет удален (первый или последний) зависит от реализации очереди.
 * Методы remove() и poll() отличаются лишь поведением, когда очередь пустая:
 *
 * !! метод remove() генерирует исключение
 * !! метод poll() возвращает null.
 *
 * Методы element() и peek() возвращают (но не удаляют) верхушку очереди.
 * peek() - не выбрасывает exception, возвращает null.
 *
 * !! Важно !! Из очереди можно удалить любой элемент, передав его в метод remove(element)
 */

public class QueueT {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Abc");
        queue.add("Bcd");
        queue.add("Cde");
        queue.add("Def");
        queue.add("Efg");
        System.out.println("==== New Queue ====");
        System.out.println(queue);
        System.out.println("==== remove() the element from 1st place ====");
        System.out.println(queue.remove());
        System.out.println("==== Queue ====");
        System.out.println(queue);
        System.out.println("==== element() shows the element at 1st place ====");
        System.out.println(queue.element());
    }
}
