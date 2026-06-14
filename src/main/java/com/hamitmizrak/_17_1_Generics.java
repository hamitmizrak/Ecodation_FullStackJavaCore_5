package com.hamitmizrak;

public class _17_1_Generics <T> {
    private String name;
    private T number;

    // Parametresiz Constructor
    public _17_1_Generics() {
    }

    // Parametreli Constructor
    public _17_1_Generics(String name, T number) {
        this.name = name;
        this.number = number;
    }

    // ToString()
    @Override
    public String toString() {
        return "_17_1_Generics{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    // Method
    public void noGenericMethod(String data){
        System.out.println(data);
    }

    public <K> void genericMethod  (K data){
        System.out.println(data);
    }


    // Getter/Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    static void main() {
        _17_1_Generics ornek= new _17_1_Generics();
        ornek.setName("Hamit");
        ornek.setNumber(true);
        System.out.println(ornek);

        ornek.noGenericMethod("Generic olamayan method");
        ornek.genericMethod(454545.5252);

        // primitive türlerin haricinden herşey objedir.
        // %100 OOP diyemiyor (primitive)
    }
}
