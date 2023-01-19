package org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Interface Iterator<E>
 * java.util.Iterator
 *
 * Перебор содержимого коллекции может быть осуществлен двумя способами:
 * c помощью цикла for each и с помощью итератора.
 *
 * Итератор позволяет осуществлять обход коллекции и при желании удалять избранные элементы.
 * Используется интерфейс Iterator.
 *
 * Все классы в каркасе коллекций усовершенствованы таким образом,
 * чтобы реализовывать интерфейс Iterable.
 * Это означает, что содержимое коллекции можно перебрать,
 * организовав цикл for в стиле for each. Конструкция for each скрывает итератор,
 * поэтому нельзя вызвать метод remove().
 *
 * Чтобы получить объект итератора, вызывается метод Iterator<E> iterator().
 *
 * Методы интерфейса Iterator:
 * boolean hasNext() - возвращает true, если есть еще элементы. В противном случае возвращает false.
 * E next() - возвращает следующий элемент.
 * Если следующий элемент коллекции отсутствует, то метод next() генерирует исключение NoSuchElementException.
 * void remove() - удаляет текущий элемент.
 * Возбуждает исключение IllegalStateException, если предпринимается попытка вызвать remove(),
 * которой не предшествовал вызов next().
 *
 *
 */

public class IteratorTest {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        /**
         * boolean hasNext() - возвращает true, если есть еще элементы. В противном случае возвращает false.
         * Удобный метод для вывода элементов массива через цикл
         */
        Iterator<String> iterator = arrayList.iterator();
        System.out.println("===== Выводит массив =====");
        while (iterator.hasNext()) {
            /**
             * iterator.hasNext() - до тех пор, пока iterator.hasNext() == true
             */
            System.out.println(iterator.next() + " ");
            /**
             * E next() - возвращает следующий элемент массива.
             */
        }
        /**
         * void remove() - удаляет текущий элемент, ни чего не возвращает
         */
        System.out.println("===== Удаляет все элементы массива =====");
        while (iterator.hasNext()) {
            iterator.remove();
        }
        System.out.println("===== Выводит массив =====");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
