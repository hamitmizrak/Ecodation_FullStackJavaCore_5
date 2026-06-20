package com.hamitmizrak.oop.interfacex;

import lombok.*;


// @Data = @Getter+@Setter+@ToString+@EqualsAndHashCode

// Lombok
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//@Builder
@EqualsAndHashCode
abstract public class Person {

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

    // Gövdesiz MEthod
    abstract public void create();

    // Getter and Setter

}
