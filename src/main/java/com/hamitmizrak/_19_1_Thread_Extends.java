package com.hamitmizrak;

public class _19_1_Thread_Extends extends Thread{

    @Override
    public void run() {
        for (int i =1 ; i <=5 ; i++) {
            try {
                System.out.println(Thread.currentThread().getName()+" -> Değer: "+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                System.out.println("Thread kesintiye uğradu");
            }
        }
    }

    // PSVM
    public static void main(String[] args) {
        _19_1_Thread_Extends thread1 = new _19_1_Thread_Extends();
        _19_1_Thread_Extends thread2 = new _19_1_Thread_Extends();

        thread1.start();
        thread2.start();
    }
}


