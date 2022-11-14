package main.java.app;

class Ex13_2 {
    public static void main(String args[]) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            System.out.printf("%s", new String("-"));
        }

        System.out.println("소요시간1: " + (System.currentTimeMillis() - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.println("소요시간2: " + (System.currentTimeMillis() - startTime));
    }
}
