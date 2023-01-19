package org.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/**
 * ListIterator - это подинтерфейс Iterator.
 * ListIterator расширяет возможности Iterator, позволяя работать не только с
 * next element, но и с previous element, т.е. ListIterator поддерживает перемещение элементов как в прямом,
 * так и в обратном направлениях.
 * Это один из способов обхода (traverse) элементов List.
 * В отличие от Iterator,
 * ListIterator также поддерживает удаление, обновление или вставку элемента во время итерации.
 * public interface ListIterator<E> extends Iterator<E>
 * <p>
 * Методы:
 * void add(Object obj) - вставляет obj в список перед элементом,
 * который будет возвращен следующим вызовом next().
 * boolean hasNext() - возвращает true, если есть следующий элемент.
 * boolean hasPrevious() - возвращает true, если есть предыдущий элемент.
 * Object next() - возвращает следующий элемент. A NoSuchElementException вызывается,
 * если не существует следующего элемента.
 * int nextIndex() - возвращает индекс следующего элемента.
 * Если нет следующего элемента, возвращается размер списка.
 * Object previous() - возвращает предыдущий элемент.
 * A NoSuchElementException вызывается, если не существует следующего элемента.
 * int previousIndex() - возвращает индекс предыдущего элемента.
 * Если нет предыдущего элемента, возвращается -1.
 * void remove() - удаляет текущий элемент из списка.
 * Вызывается IllegalStateException, если вызывается функция remove() вызвана перед next() или previous().
 * void set(Object obj) - назначает obj текущему элементу.
 * Это последний элемент, возвращаемый вызовом либо next(), либо previous().
 */

public class ListIteratorTest {
    /**
     * Проверяет строку на палиндром и возвращая boolean
     *
     * @param word
     * @return boolean
     */
    public static boolean isPalindrom(String word) {
        List<Character> list = new LinkedList<>();
        /**
         * Заполнение List<Character> list c приведением к нижнему регистру
         */
        for (char ch : word.toLowerCase().toCharArray()) {
            list.add(ch);
        }
        /**
         * Создание прямого и обратного итераторов для прохода с двух концов
         */
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> revIterator = list.listIterator(list.size());
        while (iterator.hasNext() && revIterator.hasPrevious()) {
            if (iterator.next() != revIterator.previous()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /**
         * Проверка String на палиндром
         */
        System.out.println(isPalindrom("maDaM"));
        System.out.println(isPalindrom("BaDaM"));
        /**
         * Вывод коллекции
         */
        List<String> list = List.of("A", "B", "C", "D");
        ListIterator<String> listIterator = list.listIterator();
        /**
         * Вывод коллекции в прямой последовательности
         */
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + " >> ");
        }
        /**
         * Вывод коллекции в обратной последовательности
         */
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " << ");
        }
    }
}

