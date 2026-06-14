package com.hamitmizrak;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _18_6_Collection_Set_TreeHashSet {


    static void main() {
        TreeSet<String> city = new TreeSet<>();
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
