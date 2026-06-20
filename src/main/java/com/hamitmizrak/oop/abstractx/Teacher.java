package com.hamitmizrak.oop.abstractx;

public class Teacher extends Person {


    // Field

    // Constructor

    // toString
    @Override
    public String toString() {
        return "Teacher{} " + super.toString();
    }

    // Method
    @Override
    public void create() {
        System.out.println("Teacher Create");
    }

}
