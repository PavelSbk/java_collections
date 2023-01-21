package org.collection.practise.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ArrayListPractice {

    /**
     * Необходимо реализовать метод, который будет возвращать первую строку из коллекции строк,
     * или возвращаем пустую строку если коллекция пустая
     */
    public String getElement(List<String> list) {
        return list.isEmpty() ? "" : list.get(0);
    }

    /**
     * Необходимо реализовать метод, который добавляет элемент в список и сообщает удалось это или нет.
     * Возвращаемое значение метода add() использовать нельзя
     */
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        check.add(str);
        return check.size() > list.size();
    }

    /**
     * Необходимо реализовать метод, который добавляет элемент в список по индексу,
     * если этого элемента еще нет в коллекции.
     * При этом метод должен вернуть булево значение.
     */
    public static boolean addNewElementWithNoDuplicate(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (!check.contains(str)) {
            check.add(index, str);
            return list.size() < check.size();
        }
        return list.size() < check.size();
    }

    /**
     * Метод принимает список и элемент который мы ищем в списке. Необходимо определить,
     * является ли этот элемент уникальным в этом списке.
     * Необходимо предусмотреть ситуацию, при которой
     * такого элемента нет в коллекции, в этом случае нужно вернуть false.
     */
    public static boolean checkList(List<String> list, String str) {
        return list.indexOf(str) == list.lastIndexOf(str) && list.contains(str);
    }

    /**
     * Метод принимает в качестве параметров список строк и индекс элемента,
     * в случае валидности которого необходимо заменить на последний элемент коллекции.
     * Если входящий индекса элемента невалдный,
     * то удалить последний элемент и вернуть список.
     * Добавлена проверку валидности входного параметра.
     * @param list  список элементов
     * @param index индекс элемента который необходимо заменить
     * @return изменённая коллекция
     */
    public static List<String> changePosition(List<String> list, int index) {
        if (index < list.size() - 1 && index >= 0) {
            list.set(index, list.get(list.size() - 1));
        }
        list.remove(list.size() - 1);
        return list;
    }
}
