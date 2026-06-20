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

public class Teacher  extends Person implements ICrud, Serializable {

    // Field
    private Double price;

    // Constructor
    public Teacher(Long id, String name, String surname, Double price) {
        super(id, name, surname);
        this.price = price;
    }


    // abstract Gövdesiz Methodun
    @Override
    public void noBodyMethod() {

    }

    // Interface
    @Override
    public void create() {
        System.out.println("Teacher create");
    }

    @Override
    public void list() {
        System.out.println("Teacher list");
    }

    @Override
    public void update() {
        System.out.println("Teacher update");
    }

    @Override
    public void delete() {
        System.out.println("Teacher delete");
    }

} // end Teacher
