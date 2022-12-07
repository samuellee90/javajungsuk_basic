package main.java.app;

public class Ex13_13_3 {
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        t1.run();

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}