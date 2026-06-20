package com.hamitmizrak.oop.normalx;

public class MainNormal {

    static void main() {

        // Student
        Student student = new Student();
        student.setId(1L);
        student.setName("Fatma");
        student.setSurname("Kalem");
        System.out.println(student);

        // Teacher
        Teacher teacher = new Teacher();
        teacher.setId(1L);
        teacher.setName("Abdullah");
        teacher.setSurname("Kursun kalem");
        System.out.println(teacher);




    }
}
