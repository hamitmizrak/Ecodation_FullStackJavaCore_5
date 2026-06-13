package com.hamitmizrak;

import java.util.Arrays;

public class _11_Array_1 {

    // Array: eleman sayısını bilmek zorundayız
    // 0'dan saymaya başlar
   static void main() {
       String[] city = new String[7];
       city[0] = "Malatya";
       city[1]= "Elazığ";
       city[2]="Bingöl";
       city[3]="İzmir";
       city[4]="Ankara";
       city[5]="Sivas";
       city[6]="Diyarbakır";
       System.out.println("eleman sayısı: "+ city.length);
       System.out.println(city[5]);
       System.out.println(city[city.length-1]);

       System.out.println( city.hashCode());

       String []cityClone=city.clone();
       System.out.println(cityClone.length);
       System.out.println("Original veri ile Klonlanmuş veri eşit mi? " + (cityClone.equals(city)));
       System.out.println("Original veri ile Klonlanmuş veri eşit mi? " + (cityClone== city));

       // Arrays
      boolean isEquals= Arrays.equals(city,cityClone);
       System.out.println(isEquals);


   }
}
