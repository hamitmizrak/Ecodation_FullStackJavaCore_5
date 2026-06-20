package com.hamitmizrak.oop.interfacex;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

// Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Student extends Person implements ICrud, Serializable {

    // Field
    // Field
    private String number;

    // Constructor
    public Student(Long id, String name, String surname, String number) {
        super(id, name, surname); //üst class'dan gelen özellikler
        this.number = number;
    }


    // abstract Gövdesiz Methodun
    @Override
    public void noBodyMethod() {

    }

    // Crud
    @Override
    public void create() {
        System.out.println("Student create");
    }

    @Override
    public void list() {
        System.out.println("Student list");
    }

    @Override
    public void update() {
        System.out.println("Student update");
    }

    @Override
    public void delete() {
        System.out.println("Student delete");
    }
}



