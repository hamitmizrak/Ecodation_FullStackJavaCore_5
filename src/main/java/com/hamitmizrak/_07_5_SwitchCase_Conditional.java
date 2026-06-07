package com.hamitmizrak;

public class _07_5_SwitchCase_Conditional {

    // User
    static void main() {
        int number = 59;
        if (number == 1) {
            System.out.println(number);
        } else if (number == 2) {
            System.out.println(number);
        } else if (number == 3) {
            System.out.println(number);
        } else if (number == 4) {
            System.out.println(number);
        } else if (number == 5) {
            System.out.println(number);
        } else {
            System.out.println("1<=SAYI<=5 dışındadır");
        }


        switch (number){
            case 1:
                System.out.println(number);
                break;
            case 2:
                System.out.println(number);
                break;
            case 3:
                System.out.println(number);
                break;
            case 4:
                System.out.println(number);
                break;
            case 5:
                System.out.println(number);
                break;
            default:
                System.out.println("1<=SAYI<=5 dışındadır");
                break;
        }
    }
}
