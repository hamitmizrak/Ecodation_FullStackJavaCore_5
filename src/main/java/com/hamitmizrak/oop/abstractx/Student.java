package com.hamitmizrak.oop.abstractx;

public class Student extends Person {

    // Field

    // Constructor

    // toString
    @Override
    public String toString() {
        return "Student{} " + super.toString();
    }

    // Method
    @Override
    public void create() {
        System.out.println("Student Create");
    }

}
