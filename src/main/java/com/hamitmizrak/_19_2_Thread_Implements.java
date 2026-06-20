package com.hamitmizrak;

class _19_2_Thread_Implements implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + " -> Değer: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                System.out.println("Thread kesintiye uğradu");
            }
        }
    }

    // PSVM
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new _19_2_Thread_Implements());
        Thread thread2 = new Thread(new _19_2_Thread_Implements());
        Thread thread3 = new Thread(new _19_2_Thread_Implements());

        System.out.println(thread1.isAlive());
        thread1.start();
        System.out.println(thread1.isAlive());
        System.out.println(thread1.getName());
        System.out.println(thread1.toString());
        thread1.join();

        thread2.start();
        thread3.start();
    }
}
