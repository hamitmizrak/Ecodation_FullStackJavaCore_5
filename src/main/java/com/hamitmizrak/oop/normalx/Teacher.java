package com.hamitmizrak.oop.normalx;

import java.util.Objects;

public class Teacher {
    // Field
    private Long id;
    private String name;
    private String surname;

    // Constructor (parametresiz) Overloading
    public Teacher() {
    }

    // Constructor (parametreli)
    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Constructor (parametreli)
    public Teacher(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // toString
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    // equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id) && Objects.equals(name, teacher.name) && Objects.equals(surname, teacher.surname);
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
