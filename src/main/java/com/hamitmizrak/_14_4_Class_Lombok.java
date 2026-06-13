package com.hamitmizrak;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class _14_4_Class_Lombok {

    // Field
    private String name;
    private String surname;

    // parametresiz constructor
    // parametreli constructor
    // toString
    // Getter / Setter

    static void main() {
        _14_4_Class_Lombok classBean = new _14_4_Class_Lombok("Hamit","Mızrak");
        System.out.println(classBean);
    }
}
