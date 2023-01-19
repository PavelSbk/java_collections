package org.collection.model;

public class Student {

    private String name;

    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
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
    public String toString() {
        return "Student {"
                +
                "name = '" + name + '\''
                +
                ", course = " + course
                +
                '}';
    }

//    public static void main(String[] args) {
//        Student st1 = new Student("A", 1);
//        Student st2 = new Student("B", 2);
//        Student st3 = new Student("C", 3);
//        Student st4 = new Student("D", 4);
//        Student st5 = new Student("E", 5);
//    }
}
