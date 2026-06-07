package com.hamitmizrak;

public class _09_1_String {

    // String
   static void main() {
       String value=" javase javame JAVAee javase";
       System.out.println(value);
       System.out.println(value.length());
       System.out.println(value.trim());
       System.out.println(value.trim().length());
       System.out.println(value.startsWith("javase"));
       System.out.println(value.endsWith("javase"));

       value =value.trim();
       System.out.println(value.substring(1));
       System.out.println(value.substring(1,4)); // 1<=SAYI<=4-1

       System.out.println(value.toLowerCase());
       System.out.println(value.toUpperCase());
       System.out.println(value.indexOf("javase"));
       System.out.println(value.lastIndexOf("javase"));
       System.out.println(value.isEmpty());
       System.out.println(value.charAt(0));
       System.out.println(value.contains("javase"));
       System.out.println(value.hashCode());
   }
}
