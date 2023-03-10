package org.collection.theory.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map это Ассоциативный массив — абстрактный тип данных (интерфейс к хранилищу данных),
 * позволяющий хранить пары вида «(ключ, значение)» и поддерживающий операции добавления пары,
 * а также поиска и удаления пары по ключу.
 *
 * Скорость поиска по ключу - это максимально быстрый процесс O(1),
 * так как он происходит за константное время
 *
 * В основе HashMap лежит массив. Элементами данного массива являются структуры LinkedList.
 * Данные структуры LinkedList и заполняются элементами, которые мы добавляем в HashMap.
 *
 * При создании HashMap создаётся массив на 16 ячеек, такой массив называется TABLE.
 * Каждый элемент в TABLE (или корзина bucket) может содержать в себе несколько пар (key, value)
 * Для этого, пара (key, value) объединяется в LinkedList, т.е. каждый элемент TABLE,
 * может содержать в себе LinkedLists.
 *
 * Пошаговое размещение объекта в Map на примере метода put():
 * - проверка key == null:
 * если ДА, то элемент помещается на index 0
 *
 * если НЕТ, то происходит поиск ячейки по хэшкоду:
 * - key().hashCode() - на ключе вызывается метод поиска хэшкода - он возвращает хэшкод ключа (пример 2147483647)
 * - далее с помощью простого алгоритма
 * на основе примитывной математической операции (пример 2147483647 % 16 = 15)
 * получаем индекс в массиве (пример 15)
 * - далее создаётся объект класса Node
 * static class Node<K,V> implements Map.Entry<K,V> {
 *         final int hash; - вычисленный хэш ключа (пример 15)
 *         final K key; - ключ
 *         V value; - значение
 *         Node<K,V> next; - поле нужно для работы с коллизиями
 *         Пояснение:
 * При возникновении коллизии (совпадение хэшкодов объектов) новому объекту
 * будет указана та же ячейка для размещения, что и предыдущему,
 * при этом в поле Node<K,V> next - предыдущего объекта,
 * помещается ссылка на новый объект, размещённый после него.
 * Получается LinkedList структура связанных ссылками объектов.
 * Начиная с Java 1.8 LinkedList может быть преобразован в Tree структуру.
 * !!ВАЖНО!! если входящий объект и объект в bucket РАВНЫ !!
 *  - происходит сравнение хэшкодов (int hash) ключей
 *   - происходит сравнение ключей (K key) через equals()
 *   если оба сравнения true - происходит ПЕРЕЗАПИСЬ предыдущего объекта на новый.
 *
 * Пошаговое взятие объекта из Map на примере метода get():
 * происходит поиск ячейки по хэшкоду:
 * - key().hashCode() - на ключе вызывается метод поиска хэшкода - он возвращает хэшкод ключа (пример 2147483647)
 * - далее с помощью простого алгоритма
 * на основе простой математической операции (пример 2147483647 % 16 = 15)
 * получаем индекс в массиве (пример 15)
 * - если объект в ячейке по данному индексу ОДИН - то происходит его взятие
 * - если объектов НЕСКОЛЬКО - то происходит запуск метода equals() на ключах для нахождения нужного объекта
 */

public class HashMapDepst {

    public static void main(String[] args) {
        /**
         * При созданиие Map, есть возможность указать её характеристики capacity и loadFactor.
         * capacity - размер TABLE (def 16)
         * loadFactor - (def 0.75f => 16 * 0.75 = 12) это кол-во элементов в мапе,
         * превышение которого вызовет удвоение capacity и rehashing всех элементов
         * Rehashing - that is, for each existing key-value pair,
         * calculate the hash code again with increased capacity as a parameter.
         */
        Map<Integer, String> map = new HashMap<>(16, 0.75f);
    }
}
