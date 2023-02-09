package org.collection.practise.list;

import java.util.Iterator;

/**
 * Односвязный список и реализация void reverse()
 */

public class SingleLinkList<T> implements Iterable<T>{

    ListItem<T> head; // ссылка на head
    ListItem<T> tail;

    private static class ListItem<T> {

        T data; // данные
        ListItem<T> next; // ссылка на следующий элемент

        public ListItem(T data) {
            this.data = data;
        }
    }

    /**
     * Добавление элемента в конец списка:
     * 1. Создать ListItem<T> newItem и передать в поле T data -> T item
     * 2. Валидация списка на пустоту,
     * если да: то head и tail указывают на новый элемент
     * если нет: tail.next указывает на новый элемент (tail.next = newItem),
     * а новый элемент становится tail (tail = newItem)
     */
    public void addToEnd(T item) {
        ListItem<T> newItem = new ListItem<>(item);
        if (isEmpty()) {
            head = newItem;
            tail = newItem;
        } else {
            tail.next = newItem;
            tail = newItem;
        }
    }

    public void reverse() {
        if (!isEmpty() && head.next != null) {     // Если список содержит больше одного элемента
            tail = head; // указатель tail теперь head
            ListItem<T> current = head.next;
            head.next = null; // т.к. head - теперь хвост, head.next = null
            while (current != null) {   // идём по списку, до тех пор пока current != null
                ListItem<T> next = current.next; // сохраняем ссылку на следующий элемент
                /** current.next = head;
                 * В head находится предыдущий элемент, т.е. меняются ссылки:
                 * раньше current.next ссылался на следующий элемент,
                 * а теперь current.next будет ссылаться на предыдущий элемент
                 */
                current.next = head;
                head = current;
                current = next;
            }
        }
    }

    /**
     * Проверка списка на пустоту:
     * если ссылка head == null, то список пустой
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Для организации последовательного доступа к элементам списка,
     * нужно чтобы SingleLinkList<T> реализовывал интерфейс Iterable<T>
     *
     * 1. Имплементировать метод Iterator<T> iterator()
     * 2. Итератор должен возвращать new Iterator<T>()
     *    с методами hasNext() и next()
     * 3. В итераторе определить поле на котором находится итератор (в данный момент)
     *    ListItem<T> current = head; head - это начало списка
     *
     *    hasNext() -
     */

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {

            ListItem<T> current = head;

            /**
             * возвращает true если в списке есть ещё элементы
             */
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data; // Данные из текущего элемента
                current = current.next; // положим в текущий элемент - следующий элемент (сдвиг вперёд)
                return data;
            }
        };
    }

    public static void main(String[] args) {
        SingleLinkList<Contact> contactList = new SingleLinkList<>();
        contactList.addToEnd(new Contact(123, "Васильев Евстахий Борисович", "+129381832"));
        contactList.addToEnd(new Contact(151, "Коновалов Степан Петрович", "+234432334"));
        contactList.addToEnd(new Contact(332, "Калинин Артём Валериевич", "+2234234423"));
        contactList.addToEnd(new Contact(432, "Предыбайло Григорий Анатолиевич", "+2342344234"));
        contactList.addToEnd(new Contact(556, "Степанов Мирослав Андреевич", "+6678877777"));

        for(Contact contact: contactList) {
            System.out.println(contact);
        }
        System.out.println("======= Reversed =======");
        contactList.reverse();
        for(Contact contact: contactList) {
            System.out.println(contact);
        }
    }

    static class Contact {
        int id;
        String name;
        String phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
