package com.hamitmizrak;

public class _04_Math {

    // Operator
   static void main() {

       System.out.println(Math.PI);
       System.out.println(Math.E);

       System.out.println(Math.min(-100,5));
       System.out.println(Math.max(-100,5));

       System.out.println(Math.sqrt(25)); // karekök
       System.out.println(Math.abs(-25)); //Mutlak
       System.out.println(Math.pow(2,5)); //Üslü

       System.out.println(Math.sqrt(Math.abs(-25) )); // NaN: Not A Number

       System.out.println(Math.sin(45));
       System.out.println(Math.cos(45));

       System.out.println(Math.floor(4.9)); //Aşağı yuvarla
       System.out.println(Math.ceil(4.1)); //Yukarı yuvarla
       System.out.println(Math.round(6.4)); //
       System.out.println(Math.round(6.5)); //

   }
}
