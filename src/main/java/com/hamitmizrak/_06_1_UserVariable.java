package com.hamitmizrak;

import java.util.Scanner;

public class _06_1_UserVariable {

    // User
   static void main() {
       // Scanner
       Scanner scanner= new Scanner(System.in);

       String value = "Hamit";
       System.out.println(value);

       // Kullanıcıdan Veri almak

       System.out.println("Adınızı giriniz");
       String name = scanner.nextLine();
       System.out.println(name);

   }
}
