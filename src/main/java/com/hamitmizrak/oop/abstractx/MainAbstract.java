package com.hamitmizrak.oop.abstractx;


public class MainAbstract {

    // psvm
    public static void main(String[] args) {

        // Person
        //Person person = new Person();
        //Person person = new Student();
        Person person = new Teacher();  // polymorphism
        person.setId(1L);
        person.setName("Fatma");
        person.setSurname("Kalem");
        System.out.println(person);
        person.fullName();


        // Student
        Student student = new Student();
        student.setId(1L);
        student.setName("Fatma");
        student.setSurname("Kalem");
        System.out.println(student);
        student.fullName();
        student.create();

        // Teacher
        Teacher teacher = new Teacher();
        teacher.setId(1L);
        teacher.setName("Abdullah");
        teacher.setSurname("Kursun kalem");
        System.out.println(teacher);
        teacher.fullName();
        teacher.create();
    }
}
