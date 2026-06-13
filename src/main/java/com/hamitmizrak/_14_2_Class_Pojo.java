package com.hamitmizrak;
// pojo: plain old java object
public class _14_2_Class_Pojo {

    // Field
    private String name;
    private String surname;

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
        _14_2_Class_Pojo pojo = new _14_2_Class_Pojo();
        pojo.setName("Hamit");
        pojo.setSurname("Mızrak");

        System.out.println(pojo.getName()+" "+ pojo.getSurname());

    }
}
