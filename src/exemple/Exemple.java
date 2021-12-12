package exemple;

public class Exemple {


//Отсчет на гонках
    public class Solution {
        public static volatile int numSeconds = 3;

        public static void main(String[] args) throws InterruptedException {
            RacingClock clock = new RacingClock();
            new Thread(clock);
            Thread.sleep(3500);
            clock.interrupt();
        }

        public static class RacingClock extends Thread {
            public RacingClock() {
                start();
            }

            public void run() {
                for (int i = numSeconds; i > 0; i--) {
                    try {
                        System.out.print(numSeconds + " ");
                        Thread.sleep(1000);
                        numSeconds--;

                        if (!isInterrupted() && numSeconds == 0) {
                            System.out.println("Марш!");
                        }
                    } catch (InterruptedException e) {
                        System.out.println("Прервано!");

                    }

                }
            }
        }
    }

}
