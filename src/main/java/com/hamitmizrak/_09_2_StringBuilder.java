package com.hamitmizrak;

public class _09_2_StringBuilder {

    // User
    static void main() {
        String value1 = "Malatya", value2 = "Bingöl", value3 = "Sivas";

        // 1.YOL
        String result1 = value1 + value2 + value3;
        System.out.println(result1);

        // 2.YOL
        String result2 = value1.concat(value2).concat(value3);
        System.out.println(result2);

        //3.YOL
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(value1).append(value2).append(value3);
        String result3= stringBuilder.toString();
        System.out.println(result3);

    }
}
