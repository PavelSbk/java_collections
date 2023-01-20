package org.collection.iterator;

import java.util.*;

public class IteratorUsage {

    public static void main(String[] args) {
        /**
         * Дан массив интов, его необходимо вывести на экран, перед этим упаковав в List
         */
        Integer[] arr = {1, 3, 5, 6, 11, 19, 21, 25, 28, 32, 34};
        List<Integer> intList = new ArrayList<>();
        Collections.addAll(intList, arr);
        System.out.println("==== Print as ArrayList ====");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
        /**
         * В случае c ArrayList, скорость get(i) = O(1) - т.е. константное время
         */
        List<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, arr);
        System.out.println("==== Print as LinkedList ====");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        /**
         * В случае c LinkedList, скорость get(i) = O(n) - т.е. линейное время
         */
        /**
         * Постановка задачи:
         * Необходимо применить универсальный способ прохода по коллекции так,
         * чтобы не раскрывать детали реализации каждой коллекции, т.е. абстрагироваться от особенностей коллекции,
         * создать универсальный способ проведения итерации по всем элементам,
         * не нарушая принципа инкапсуляции.
         * Оптимальным решением будет использование специального класса для прохода по элементам коллекции
         */
        System.out.println("==== Print with Iterator ====");
        Iterator<Integer> iterator1 = linkedList.listIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        /**
         * Аналогичная запись через for each
         */
        System.out.println("==== Print with for each ====");
        for (Integer i : linkedList) {
            System.out.println(i);
        }
        /**
         * Постановка задачи:
         * Дана коллекция интов LinkedList<Integer>, е`го` необходимо обработать за константное время O(1),
         * а именно:
         * удалить все нечётные цифры
         * Решение:
         * метод remove() - имеет скорость O(n), так как необходимо пройти по всей коллекции до искомого значения
         * Для максимального ускорения, необходимо использовать удаление итератором:
         */
        System.out.println("==== Remove all Odd numbers ====");
        List<Integer> listInt = List.of(2, 3, 5, 6, 11, 19, 21, 25, 28, 32, 34);
        List<Integer> list = new LinkedList<>(listInt);
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp % 2 != 0) {
                iterator.remove();
            }
        }
        list.forEach(System.out::println);
        /**
         * или
         */
        list.removeIf(temp -> temp % 2 != 0);
        list.forEach(System.out::println);
    }
}
