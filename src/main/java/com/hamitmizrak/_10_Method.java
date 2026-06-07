package com.hamitmizrak;

public class _10_Method {

    // 1-) parametresiz-returnsuz
    public static void parametresizReturnsuz() {
        System.out.println(" parametresiz-returnsuz");
    }

    // 2-) parametreli-returnsuz
    public static void parametreliReturnsuz(String name) {
        System.out.println(" parametreli-returnsuz " + name);
    }

    // 3-) parametresiz-returnlu
    public static String parametresizReturnlu() {
        return " parametresiz-returnlu";
    }

    // 4-) parametreli-returnlu
    public static String parametreliReturnlu(String name, String surname) {
        return " parametreli-returnlu "+name+surname;
    }


    static void main() {
        parametresizReturnsuz();
        parametreliReturnsuz("Hamit");
        String result1 = parametresizReturnlu();
        System.out.println(result1);

        String result2 = parametreliReturnlu("Hamit","Mızrak");
        System.out.println(result2);
    }

}

// static
// break
// return
// continue