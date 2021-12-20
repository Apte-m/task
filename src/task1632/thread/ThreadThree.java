package com.javarush.task.task16.task1632.thread;

public class ThreadThree extends Thread {

    public void run() {
        try {
            do {
                System.out.println("Ура");
                Thread.sleep(500);
            }
            while (true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
