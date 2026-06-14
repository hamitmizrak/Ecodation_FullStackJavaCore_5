package com.hamitmizrak;

import java.util.Iterator;
import java.util.LinkedList;

public class _18_1_Collection_List_LinkedList {


    static void main() {
        LinkedList<String> city = new LinkedList<>();
        city.add("Malatya");
        city.add("Bingöl");
        city.add("Sivas");
        city.add("Bitlis");
        city.add("Bolu");
        city.add("Bingöl");

        System.out.println(city.size());
        System.out.println(city.get(0));
        System.out.println(city.get(3));
        System.out.println(city.get(city.size()-1));
        System.out.println(city.isEmpty());
        System.out.println(city.hashCode());
        System.out.println(city.contains("Bingöl"));
        System.out.println(city.indexOf("Bingöl"));
        System.out.println(city.lastIndexOf("Bingöl"));

        String data = city.toString();
        System.out.println(data);

        // Iterative for
         System.out.println("*** Iterative for ***");
        for (int i = 0; i <city.size() ; i++) {
            System.out.println(i+" ==> "+ city.get(i));
        }

        // for-Each
        System.out.println("\n*** for each ***");
        for (String temp : city ){
            System.out.println(temp);
        }

        // Iterator
        System.out.println("\n*** ITERATOR ***");
        Iterator iterator= city.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }

        System.out.println("\n*** STREAM-1 ***");
        city.stream().forEach((temp)->{
            System.out.println(temp);
        });

        System.out.println("\n*** STREAM-2 ***");
        city.forEach((temp)->{
            System.out.println(temp);
        });

        System.out.println("\n*** STREAM-3 ***");
        city.forEach(System.out::println);
    }
}
