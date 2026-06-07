package com.hamitmizrak;

public class _8_3_Loop_Dowhile {

    // For
    static void main() {
        //System.out.println(1+2+3+4+5+6+7+8+9);
        int tempFor = 0;

        System.out.println("*** FOR ***");
        for (int i = 1; i <= 9; i++) {
            tempFor = tempFor + i;
        }
        System.out.println(tempFor);
        // sonsuz for(;;){}


        System.out.println("\n*** WHILE ***");
        int x = 1;
        int tempWhile = 0;
        while (x <= 9) {
            //tempWhile = tempWhile +x;
            tempWhile += x;
            x++;
        }
        System.out.println(tempWhile);


        System.out.println("\n*** DO-WHILE ***");
        int y = 1;
        int tempDoWhile = 0;
        do {
            //tempWhile = tempWhile +x;
            tempDoWhile += y;
            y++;
        } while (y <= 9);
        System.out.println(tempDoWhile);

    }
}
