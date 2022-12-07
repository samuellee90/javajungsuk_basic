package main.java.app;

public class Ex13_13_1 {
    public static void main(String args[]) {
        Thread th1 = new Thread1();
        th1.start();

        Runnable th2 = new Thread2();
        th2.run();
    }
}

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 3000; i++) {
            System.out.print('-');
        }
    }
}

class Thread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 3000; i++) {
            System.out.print('|');
        }
    }
}