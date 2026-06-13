package com.hamitmizrak;

// bean= pojo+ constructor+toString
public class _14_3_Class_Bean {


    // Field
    private String name;
    private String surname;

    // parametresiz constructor
    public _14_3_Class_Bean() {
    }

    // parametreli constructor
    public _14_3_Class_Bean(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // toString
    @Override
    public String toString() {
        return "_14_3_Class_Bean{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    // Getter / Setter
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


    static void main() {
        _14_3_Class_Bean classBean = new _14_3_Class_Bean("Hamit","Mızrak");
        System.out.println(classBean);
    }
}
