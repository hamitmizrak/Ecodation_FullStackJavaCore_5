package com.hamitmizrak.oop.normalx;

import java.util.Objects;

public class Student {

    // Field
    private Long id;
    private String name;
    private String surname;

    // Constructor (parametresiz) Overloading
    public Student() {
    }

    // Constructor (parametreli)
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Constructor (parametreli)
    public Student(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // toString
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    // equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }


    // Method
    public void fullName(){
        System.out.println(this.name+ " "+this.surname);
    }

    // Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
