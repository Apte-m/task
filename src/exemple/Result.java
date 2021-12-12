package exemple;

public class Result {

    public class Solution {
        private static volatile boolean result = false;
        public static void main(String[] args) throws InterruptedException {

            Thread t = new Thread(new TestThread());
            t.start();
            Thread.sleep(3000);
            ourInterruptMethod();
        }

        public static void ourInterruptMethod() {
            result = true;


        }

        public static class TestThread implements Runnable {
            public void run() {
                while (!result) {
                    try {
                        System.out.println("he-he");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }

}
