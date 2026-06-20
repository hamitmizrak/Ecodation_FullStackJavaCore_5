package com.hamitmizrak.oop.inheritancex;

import lombok.*;

import java.util.Objects;

// Lombok
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    // Field
    private Long id;
    private String name;
    private String surname;

    // Constructor (parametresiz) Overloading

    // Constructor (parametreli)

    // toString

    // Method
    public void fullName(){
        System.out.println(this.name+ " "+this.surname);
    }

    // Getter and Setter

}
