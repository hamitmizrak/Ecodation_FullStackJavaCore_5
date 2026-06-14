package com.hamitmizrak;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class _18_7_Collection_Map_HashMap {


    static void main() {
        HashMap<Integer,Object> city = new HashMap<>();
        city.put(1,"Malatya");
        city.put(2,"Bingöl");
        city.put(3,"Sivas");
        city.put(4,"Bitlis");
        city.put(5,"Bolu");
        city.put(6,"Bingöl");

        System.out.println(city.size());
        System.out.println(city.isEmpty());
        System.out.println(city.hashCode());

        String data = city.toString();
        System.out.println(data);

        for(Integer key: city.keySet()){
            System.out.println(key+" ==> "+city.get(key));
        }

    }
}
