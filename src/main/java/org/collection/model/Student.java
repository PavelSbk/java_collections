package org.collection.model;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;

    private String surname;

    private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        if (name.equals(o.getName())
                && surname.equals(o.getSurname())) {
            return Integer.compare(course, o.getCourse());
        }
        if (name.equals(o.getName())) {
            return surname.compareTo(o.getSurname());
        }
        return name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course
                && Objects.equals(name, student.name)
                && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student {"
                +
                "name = '" + name + '\''
                +
                ", surname = '" + surname + '\''
                +
                ", course = " + course
                +
                '}';
    }
//    Student st1 = new Student("A", "Abc", 1);
//    Student st2 = new Student("B", "Bcd", 2);
//    Student st3 = new Student("C", "Cde", 3); //
//    Student st4 = new Student("D", "Def", 4);
//    Student st5 = new Student("A", "Efg", 5);
//    Student st6 = new Student("F", "Cde", 5);
//    Student st7 = new Student("G", "Bcd", 5);
//    Student st8 = new Student("C", "Cde", 3); //
//    Student st9 = new Student("Z", "Zwx", 3);
}
