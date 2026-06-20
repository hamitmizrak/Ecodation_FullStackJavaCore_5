package com.hamitmizrak.oop.interfacex;

public interface ICrud {

    // Gövdesiz metotlar
    // CRUD
    public void create();
    public void list();
    public void update();
    public void delete();

    // Gövdeli metotlar
    default void deneme(){

    }
}
