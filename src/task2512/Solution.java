package com.javarush.task.task25.task2512;

import java.util.LinkedList;
import java.util.List;

/* 
Живем своим умом
*/

public class Solution implements Thread.UncaughtExceptionHandler {

    public void soute(Throwable e) {
        if (e.getCause() != null)
            soute(e.getCause());
        System.out.println(e);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        if (e instanceof Exception) {
            t.interrupt();
            soute(e);

        }

    }

    public static void main(String[] args) {
        new Solution().uncaughtException(new Thread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}
