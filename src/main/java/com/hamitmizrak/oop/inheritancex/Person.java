package com.hamitmizrak.oop.inheritancex;

import lombok.*;

import java.util.Objects;


// @Data = @Getter+@Setter+@ToString+@EqualsAndHashCode

// Lombok
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
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
