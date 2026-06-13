package com.hamitmizrak;

import java.time.LocalDateTime;

public class _13_3_LocalDateTime {

    static void main() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Gün: "+now.getDayOfMonth());
        System.out.println("Kaçıncı ay: "+now.getMonthValue());
        System.out.println("Yıl: "+now.getYear());
        System.out.println("Ay: "+now.getMonth());
        System.out.println("Saat: "+now.getHour());
        System.out.println("Dakika: "+now.getMinute());
        System.out.println("Saniye: "+now.getSecond());

        LocalDateTime newData= LocalDateTime.now()
                .withDayOfMonth(11)
                .withMonth(12)
                .withHour(14)
                .withMinute(22)
                .withSecond(59);
        System.out.println(newData);
    }
}
