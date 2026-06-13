package com.hamitmizrak;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Date 1900 (+-)
public class _13_4_Date_All {

    public static void allData(){
        Date now= new Date();
        System.out.println("Şimdiki zaman: "+now);
        // 1 OCAK 1970   - 13 Haziran 2026 milisaiye (1000ms=1s)
        System.out.println("Şimdiki zaman: "+now.getTime());
        System.out.println("Şimdiki zaman: "+now.getHours()+":"+now.getMinutes()+":"+now.getSeconds());

        System.out.println("*****SET/GET*****");
        System.out.println("Şimdiki saat: "+now.getHours());

        // SET
        now.setHours(5);
        System.out.println("Şimdiki saat: "+now.getHours());
    }

    public static void dataFormat(){
        Date date = new Date();
        System.out.println(date);

        Locale locale = new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss",locale);
        String formattedDate= simpleDateFormat.format(date);
        System.out.println(formattedDate);
    }

    static void main() {
        //allData();
        dataFormat();


    }
}
