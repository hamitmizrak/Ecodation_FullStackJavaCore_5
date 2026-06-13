package com.hamitmizrak;

import java.util.Arrays;

public class _11_Array_2 {

    // Array: eleman sayısını bilmek zorundayız
    // 0'dan saymaya başlar
    static void main() {
        String[] city = new String[7];
        city[0] = "Malatya";
        city[1] = "Elazığ";
        city[2] = "Bingöl";
        city[3] = "İzmir";
        city[4] = "Ankara";
        city[5] = "Sivas";
        city[6] = "Diyarbakır";

        // iterative for
        System.out.println("*** Iterative ***");
        for (int i = 0; i < city.length; i++) {
            System.out.println(i + " ==> " + city[i]);
        }

        Arrays.sort(city);
        System.out.println("*** Clone ***");
        // isimsel olarak biz buna "for each" diyoruz
        for (String temp : city) {
            System.out.println(temp);
        }


        int isResult = Arrays.binarySearch(city, "Malatya");
        System.out.println(isResult);


    }
}
