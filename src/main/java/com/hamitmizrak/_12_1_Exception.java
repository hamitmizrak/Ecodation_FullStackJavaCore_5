package com.hamitmizrak;

// try -catch -finally- throw -throws
public class _12_1_Exception {


    static void main() {
        System.out.println("Data Exception");
        try {
            double number = 3 / 0;
            System.out.println("result ==> " + number);
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("İşlem bitti");
        }

        System.out.println("Bu son satır");
    }


}
