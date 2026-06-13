package com.hamitmizrak;

import java.util.Date;

// Date 1900 (+-)
public class _13_4_Date_All {

    static void main() {
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
}
