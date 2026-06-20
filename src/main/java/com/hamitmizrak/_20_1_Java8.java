package com.hamitmizrak;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _20_1_Java8 {

    private static List<String> getCity(){
        String[] city = {"Malatya","Malatya","Elazığ","Bingöl","Balıkesir","Kahramanmaraş","Hatay","Sivas"};
        return List.of(city);
    }

    private static void allMethod1(){
        List<String> example = getCity().stream().collect(Collectors.toList());
        example.stream().forEach( (temp) -> {
            System.out.println(temp+" ");
        });
    }

    private static void allMethod2(){

        /*
        Veriler illerden;
         içinde Malatya olmayan illerden, tekrar etmeyen ilin, küçükten büyüğe doğru sıralansın, bu şartları sağlayan sadece 4 tane ili alsın ve bu illerdi büyük harfle gösteren listeyi ekrana yazdırınız.
         */
        List<String> example = getCity().stream().collect(Collectors.toList());
        example.stream()
                .distinct()  // tekrarsız veri
                .filter((temp)-> !"Malatya".equals(temp)) // Malatya ili dışındaki iller
                .limit(4) // sadece 4 tane il olsun
                .map((temp) -> temp.toUpperCase()) // bütün iller büyük harf olsun
                .sorted()    // küçükten büyüğe sıralama
                //.sorted(Comparator.reverseOrder())    // büyükten küçüğe sıralama
                .forEach( (temp) -> {
            System.out.println(temp+" ");
        });
    }


    public static void main(String[] args) {
        //allMethod1();
        allMethod2();
    }
}
