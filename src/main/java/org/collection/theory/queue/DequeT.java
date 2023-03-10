package org.collection.theory.queue;

/**
 * Интерфейс Deque (double enden queue) расширяет вышеописанный интерфейс Queue
 * и определяет поведение двунаправленной очереди,
 * которая работает как обычная однонаправленная очередь,
 * либо как стек, действующий по принципу LIFO (последний вошел - первый вышел).
 *
 * Queue:
 *
 * prev element -> prev element -> prev element -> add new element
 *
 * Deque:
 *
 * offerFirst(E obj) add new element -> prev element -> prev element -> prev element
 * or
 * prev element -> prev element -> prev element -> add new element offerLast(E obj)
 *
 * Интерфейс Deque определяет следующие методы:
 *
 * void addFirst(E obj): добавляет элемент в начало очереди
 *
 * void addLast(E obj): добавляет элемент obj в конец очереди
 *
 * E getFirst(): возвращает без удаления элемент из головы очереди.
 * Если очередь пуста, генерирует исключение NoSuchElementException
 *
 * E getLast(): возвращает без удаления последний элемент очереди.
 * Если очередь пуста, генерирует исключение NoSuchElementException
 *
 * boolean offerFirst(E obj): добавляет элемент obj в самое начало очереди.
 * Если элемент удачно добавлен, возвращает true, иначе - false
 *
 * boolean offerLast(E obj): добавляет элемент obj в конец очереди.
 * Если элемент удачно добавлен, возвращает true, иначе - false
 *
 * E peekFirst(): возвращает без удаления элемент из начала очереди.
 * Если очередь пуста, возвращает значение null
 *
 * E peekLast(): возвращает без удаления последний элемент очереди.
 * Если очередь пуста, возвращает значение null
 *
 * E pollFirst(): возвращает с удалением элемент из начала очереди.
 * Если очередь пуста, возвращает значение null
 *
 * E pollLast(): возвращает с удалением последний элемент очереди.
 * Если очередь пуста, возвращает значение null
 *
 * E pop(): возвращает с удалением элемент из начала очереди.
 * Если очередь пуста, генерирует исключение NoSuchElementException
 *
 * void push(E element): добавляет элемент в самое начало очереди
 *
 * E removeFirst(): возвращает с удалением элемент из начала очереди.
 * Если очередь пуста, генерирует исключение NoSuchElementException
 *
 * E removeLast(): возвращает с удалением элемент из конца очереди.
 * Если очередь пуста, генерирует исключение NoSuchElementException
 *
 * boolean removeFirstOccurrence(Object obj): удаляет первый встреченный элемент obj из очереди.
 * Если удаление произшло, то возвращает true, иначе возвращает false.
 *
 * boolean removeLastOccurrence(Object obj): удаляет последний встреченный элемент obj из очереди.
 * Если удаление произшло, то возвращает true, иначе возвращает false.
 *
 * Таким образом, наличие методов pop и push позволяет классам, реализующим этот элемент, действовать в качестве стека.
 * В тоже время имеющийся функционал также позволяет создавать двунаправленные очереди,
 * что делает классы, применяющие данный интерфейс, довольно гибкими.
 *
 * Класс ArrayDeque
 * В Java очереди представлены рядом классов. Одни из низ - класс ArrayDeque<E>.
 * Этот класс представляют обобщенную двунаправленную очередь,
 * наследуя функционал от класса AbstractCollection и применяя интерфейс Deque.
 *
 * В классе ArrayDeque определены следующие конструкторы:
 *
 * ArrayDeque(): создает пустую очередь
 *
 * ArrayDeque(Collection<? extends E> col): создает очередь, наполненную элементами из коллекции col
 *
 * ArrayDeque(int capacity): создает очередь с начальной емкостью capacity.
 * Если мы явно не указываем начальную емкость, то емкость по умолчанию будет равна 16
 */

public class DequeT {
}
