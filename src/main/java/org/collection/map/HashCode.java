package org.collection.map;

import org.collection.model.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * Сначала объекты сравниваются методом hashcode(), потом equals(), это сделано из-за
 * более быстрой работы метода hashCode()
 * Если хэшкоды разные - значит объекты не равны
 * Если хэшкоды одинаковые - происходит уточняющее сравнение методом equals()
 *
 * !!! ВАЖНО ВСЕГДА!!! переопределяя equals() переопределять и hashcode()
 *
 * !!! ВСЕГДА !!! Если объекты согласно equals() равны, то их хэшкоды ТОЖЕ РАВНЫ!!!
 *
 * Если объекты согласно equals не равны, то их hashcode могут быть равны
 */
public class HashCode {

    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Pavel", "Sbk", 3);
        map.put(st1, 6.6);
        Student st2 = new Student("Ivan", "X", 1);
        map.put(st2, 5.3);
        Student st3 = new Student("Olga", "Abc", 5);
        map.put(st3, 9.9);
        Student st4 = new Student("Maria", "Cod", 2);
        map.put(st4, 7.2);
        map.forEach((s, d) -> System.out.println(s + " " + "average " + d));

        /** ХЕШИРОВАНИЕ
         * Хеширование - это преобразования с помощью метода hashCode() любого объекта в int
         * т.е. метод преобразует поля класса в int, суммирует и возвращает сумму
         * Пример собственного метода hashCode() (для класса org.collection.model.Student):
         *
         * По умолчанию, функция hashCode() для объекта возвращает номер ячейки памяти,
         * где объект сохраняется. Поэтому, если изменение в код приложения не вносятся,
         * то функция должна выдавать одно и то же значение.
         * При незначительном изменении кода значение hashCode также изменится.
         *
         * @Override
         *     public int hashCode() {
         *         return name.length() * 7 + surname.length * 11 + course * 53;
         *     }
         *
         * У Object есть метод hash(), оптимизированный генератор hashCode, на основании
         * переданных элементов класса Object (любого класса), поэтому оптимальным считается
         * переопределение вида:
         *
         * @Override
         *     public int hashCode() {
         *         return Objects.hash(name, surname, course);
         *     }
         *
         * Коллизия в hashCode — это ситуация,
         * в которой два разных объекта имеют одинаковое значение hashCode.
         */
        System.out.println("=== Put In new student st5 = st1 ===");
        Student st5 = new Student("Pavel", "Sbk", 3);
        map.put(st5, 6.6);
        map.forEach((s, d) -> System.out.println(s + " " + "average " + d));
        System.out.println("=== When equals() is true st5 == st1 and hash codes are ALWAYS the same ===");
        System.out.println(st1.equals(st5));
        System.out.println("st1 hashcode is: " + st1.hashCode());
        System.out.println("st5 hashcode is: " + st5.hashCode());
    }
}
