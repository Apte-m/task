package com.javarush.task.task25.task2505;

/* 
Без дураков
*/

import com.sun.javafx.binding.StringFormatter;

public class Solution {

    public static void main(String[] args) {
        MyThread myThread = new Solution().new MyThread("super secret key");
        myThread.start();
    }

    public class MyThread extends Thread {
        private String secretKey;
        private class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                try {
                    Thread.sleep(500);
                    String result = String.format("%s, %s, %s",secretKey,t.getName(),e.getMessage());
                    System.out.println(result);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
            setDaemon(false);
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }
    }

}

