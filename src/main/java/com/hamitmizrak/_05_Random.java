package com.hamitmizrak;

import java.util.Random;

public class _05_Random {

    // Random
   static void main() {

       // Math Random
       System.out.println(Math.random()*3+1);
       System.out.println(Math.floor(Math.random()*3+1) );

       // Class Random
       Random random= new Random();
       double data = random.nextDouble(3)+1;
       System.out.println(data);

       int data2 = random.nextInt(3)+1;
       System.out.println(data2);

   }
}
