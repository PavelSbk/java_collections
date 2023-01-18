package org.collection.list;

import org.collection.model.Animal;
import org.collection.model.Classification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * ArrayList - resizable array or dynamic array
 */

public class ArrayListMethods {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        /** ADD
         * boolean add() - метод добавляет в ArrayList переданный объект
         * При пелеполнении capacity создаётся новый массив,
         * его вместимость увеличивается по формуле capacity * 1.5 + 1,
         * после этого в него копируется старый c добавленным переполнившим элементом
         */
        System.out.println("==========Add==========");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.forEach(System.out::println);

        /** ADD
         * boolean add(int index, DataType element) - метод добавляет в ArrayList переданный объект element
         * на место index
         * Если index > длины массива - IndexOutOfBoundException
         */
        System.out.println("======Add at index=====");
        arrayList.add(2, "C");
        arrayList.forEach(System.out::println);

        /** GET
         * DataType get(int index) - возвращает элемент по индексу с типом <DataType>
         * или IndexOutOfBoundException
         */
        System.out.println("==========Get==========");
        System.out.println(arrayList.get(2));

        /** SET
         * DataType set(int index, DataType element) - заменяет элемент на месте index на element (replacing method)
         * возвращает заменённый элемент
         */
        System.out.println("==========Set==========");
        arrayList.set(0, "AA");
        arrayList.forEach(System.out::println);

        /** REMOVE
         * boolean remove(Object element) - удалит первое совпадение с элементом в массиве
         * DataType remove(int index) - удалит элемент с индексом
         * или IndexOutOfBoundException
         */
        System.out.println("==========Remove==========");
        arrayList.remove(3);
        arrayList.forEach(System.out::println);
        System.out.println();
        arrayList.add(1, "C");
        arrayList.remove("C");
        arrayList.forEach(System.out::println);
        List<Animal> animals = new ArrayList<>();
        Animal a1 = new Animal("Слон", 20, Classification.HERBIVORE);
        Animal a2 = new Animal("Лев", 10, Classification.PREDATOR);
        Animal a3 = new Animal("Гиена", 11, Classification.PREDATOR);
        Animal a4 = new Animal("Жираф", 20, Classification.HERBIVORE);
        Animal a5 = new Animal("Гибон", 35, Classification.OMNIVOROUS);
        Animal a6 = new Animal("Гибон", 27, Classification.OMNIVOROUS);
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
        animals.add(a5);
        animals.add(a6);
        System.out.println("========== List of animals ==========");
        animals.forEach(System.out::println);
        animals.remove(a4);
        System.out.println("========== Remove \"Жираф\"==========");
        animals.forEach(System.out::println);
        animals.remove(2);
        System.out.println("========== Remove index 2 ==========");
        animals.forEach(System.out::println);

        /** AddAll
         * boolean addAll(ArrayList aL) - добавляет в конец массива весь переданный ArrayList aL
         * boolean addAll(int index, ArrayList aL) - добавляет ArrayList aL в массива на места начиная с index
         */
        List<String> arrList1 = new ArrayList<>();
        arrList1.add("Abc");
        arrList1.add("Dfg");
        System.out.println("========== Array 1 ==========");
        arrList1.forEach(System.out::println);
        List<String> arrList2 = new ArrayList<>();
        arrList2.add("Cba");
        arrList2.add("Gfd");
        System.out.println("========== Array 2 ==========");
        arrList2.forEach(System.out::println);
        arrList1.addAll(arrList2);
        System.out.println("========== Array 1 + Array 2 ==========");
        arrList1.forEach(System.out::println);
        System.out.println("========== Array 1 + Array 2 from 1 index ==========");
        arrList1.remove("Gfd");
        arrList1.remove("Cba");
        arrList1.addAll(1, arrList2);
        arrList1.forEach(System.out::println);

        /** CLEAR
         * void clear() - очищает массив
         */
        System.out.println("========== Cleared Array 2 ==========");
        arrList2.clear();
        arrList2.forEach(System.out::println);
        System.out.println();

        /** IndexOf
         * int indexOf(Object element) - возвращает индекс первого нахождения Object element или -1
         */
        System.out.println("========== IndexOf \"Gfd\" ==========");
        System.out.println(arrList1.indexOf("Gfd"));

        /** LastIndexOf
         * int lastIndexOf(Object element) - возвращает индекс последнего нахождения Object element или -1
         */
        System.out.println("========== LastIndexOf \"Gfd\" ==========");
        arrList1.add("Gfd");
        System.out.println(arrList1.lastIndexOf("Gfd"));

        /** SIZE
         * int size() - возвращает кол-во элементов массива
         */
        System.out.println("========== Array 1 size ==========");
        System.out.println(arrList1.size());

        /** IsEMPTY
         * boolean isEmpty() - проверка на пустой массив
         */
        System.out.println("========== Is the Array 1 empty? ==========");
        System.out.println(arrList1.isEmpty());

        /** CONTAINS
         * boolean contains(Object element) - проверка на наличие Object element в массиве,
         * зависит от equals()
         */
        System.out.println("========== Does the Array 1 contain \"Gfd\"? ==========");
        System.out.println(arrList1.contains("Gfd"));

        /** ToSTRING
         * String toString() - вызывается по умолчанию
         */
        System.out.println("========== Array 1 toString() ==========");
        System.out.println(arrList1.toString());

        /** ArraysAsList
         * List<DataType> Arrays.asList(DataType []) - возвращает List из массива
         */
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] arrSb = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(arrSb);

        /** RemoveAll
         * boolean removeAll(Collection <?> c) - удаляет все элементы ArrayList, которые есть в Collection <?> c
         */
        System.out.println("========== Remove All method ==========");
        arrList1.clear();
        arrList2.clear();
        arrList1.add("A");
        arrList1.add("B");
        arrList1.add("C");
        arrList1.add("D");
        System.out.println("Array 1 " + arrList1);
        arrList2.add("D");
        arrList2.add("A");
        arrList2.add("E");
        arrList2.add("F");
        System.out.println("Array 2 " + arrList2);
        System.out.println("Array 1 remove all from Array 2 = " + arrList1.removeAll(arrList2));
        System.out.println("Array 1 " + arrList1);

        /** RetainAll
         * boolean retainAll(Collection <?> c) - оставляет все одинаковые элементы ArrayList,
         * которые есть в Collection <?> c, остальное удаляет
         */
        System.out.println("========== Retain All method ==========");
        arrList1.clear();
        arrList2.clear();
        arrList1.add("A");
        arrList1.add("B");
        arrList1.add("C");
        arrList1.add("D");
        System.out.println("Array 1 " + arrList1);
        arrList2.add("D");
        arrList2.add("A");
        arrList2.add("E");
        arrList2.add("F");
        System.out.println("Array 2 " + arrList2);
        System.out.println("Array 1 retain all from Array 2 = " + arrList1.retainAll(arrList2));
        System.out.println("Array 1 " + arrList1);

        /** ContainsAll
         * boolean containsAll(Collection <?> c) - проверяет, содержит ли ArrayList,
         * все элементы, которые есть в Collection <?> c
         */
        System.out.println("========== Contains All method ==========");
        arrList1.clear();
        arrList2.clear();
        arrList1.add("A");
        arrList1.add("B");
        arrList1.add("C");
        arrList1.add("D");
        arrList1.add("E");
        System.out.println("Array 1 " + arrList1);
        arrList2.add("C");
        arrList2.add("D");
        arrList2.add("A");
        arrList2.add("B");
        System.out.println("Array 2 " + arrList2);
        System.out.println("Array 1 contains all from Array 2 = " + arrList1.containsAll(arrList2));
        System.out.println("Array 1 " + arrList1);

        /** SubLIST
         * List<E> subList(int fromIndex, int toIndex) - возвращает List<E> в виде view (представления)
         * участка ArrayList от fromIndex [входит] до toIndex (не входит)
         * !Важно! view (представление) - это временная ссылка, зависящая от ArrayList
         * т.е. после изменения ArrayList view List<E> изменится (если изменения касались области метода)
         */
        System.out.println("========== Sub List from [1 to 4) ==========");
        System.out.println(arrList1);
        System.out.println("View of arrList1 part from index 1 to index 4: " + arrList1.subList(1, 4));
        System.out.println("Replace " + arrList1.set(2, "Z") + " for Z");
        System.out.println(arrList1);
        System.out.println("View of arrList1 part from index 1 to index 4: " + arrList1.subList(1, 4));

        /** ToARRAY
         * Object[] toArray() - преобразует ArrayList в массив Object[]
         * T[] toArray(T [] a) - преобразует ArrayList в массив T[] a указанного типа
         */
        System.out.println("========== To array from ArrayList ==========");
        Object[] arr = arrList1.toArray();
        String[] arrStr = arrList1.toArray(new String[6]);
        for (String e : arrStr) {
            System.out.println(e);
        }

        /** ListOf
         *
         * List<E> List.of(E ... elements) - создаёт List<E> с переданными элементами
         * List<E> - невозможно изменить => UnsupportedOperationException
         * List<E> - не может содержать null => NullPointerException
         */
        System.out.println("========== ListOf ==========");
        List<Integer> intList1 = List.of(1, 2, 3, 4, 5);
        System.out.println("intList1: " + intList1);

        /** ListCopyOf
         *
         * List<E> List.copyOf(Collection<E> cl) - принимает коллекцию cl и возвращает List<E>
         * List<E> - невозможно изменить => UnsupportedOperationException
         * List<E> - не может содержать null => NullPointerException
         */
        System.out.println("========== List Copy Of ==========");
        List<String> list2 = List.copyOf(arrList1);
        System.out.println("List.copyOf(arrList1): " + list2);
    }
}
