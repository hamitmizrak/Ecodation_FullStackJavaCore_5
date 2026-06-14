package com.hamitmizrak;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class _18_4_Collection_Set_HashSet {


    static void main() {
        HashSet<String> city = new HashSet<>();
        city.add("Malatya");
        city.add("Bingöl");
        city.add("Sivas");
        city.add("Bitlis");
        city.add("Bolu");
        city.add("Bingöl");

        System.out.println(city.size());
        System.out.println(city.isEmpty());
        System.out.println(city.hashCode());
        System.out.println(city.contains("Bingöl"));

        String data = city.toString();
        System.out.println(data);

        // Iterator
        System.out.println("\n*** ITERATOR ***");
        Iterator iterator= city.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }
}
