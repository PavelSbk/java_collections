package org.collection.theory.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList - resizable array or dynamic array
 * Используется когда необходима структура массива с возможностями:
 * - удаления элементов
 * - добавления новых элементов
 * - изменения элементов
 * - и т.д.
 * т.к. ArrayList может изменять свою длину и работает только с ссылками
 * В основе ArrayList лежит массив Object
 */
public class ArrayListCreating {

    public static void main(String[] args) {
        /**
         * Варианты создание ArrayList:
         * При создании ArrayList выделяется 10 мест (capacity)
         * При заранее известном количестве ячеек рационально указывать capacity сразу
         * ArrayList<Integer> arrayList1 = new ArrayList<>(30);
         */
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        /**
         * add() - метод добавляет в ArrayList переданный объект
         * При пелеполнении capacity создаётся новый массив,
         * его вместимость увеличивается по формуле capacity * 1.5 + 1,
         * после этого в него копируется старый и в конец добавляется переполняющий элемент
         */
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        System.out.println(arrayList1);
        /**
         * Правильное создание ArrayList:
         * List<Integer> list = new ArrayList();
         * List - это интерфейс, который расширяет функцональность интерфейса Collection
         * ArrayList - это класс, являющийся встроенной реализацией интерфейса List
         * Создавать ArrayList таким образом очень выгодно с точки зрения полиморфизма,
         * так как реализацией интерфейса List являются:
         * - ArrayList
         * - LinkedList
         * - Vector
         */
        List<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(6);
        List<Integer> arrayList = new ArrayList<>(arrayList2);
        System.out.println(arrayList);
        System.out.println(arrayList == arrayList2); // arrayList и arrayList2 - ссылаются на разные объекты
    }
}
