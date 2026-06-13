package com.hamitmizrak;

import java.util.Calendar;

public class _13_2_Calendar {

    static void main() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getTime());
        calendar.set(2015, 10,1);
        System.out.println(calendar.getTime());
    }
}
