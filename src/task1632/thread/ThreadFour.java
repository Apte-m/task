package com.javarush.task.task16.task1632.thread;

import com.javarush.task.task16.task1632.Message;

public class ThreadFour extends Thread implements Message {

    public void run() {
        while (!isInterrupted()) {

        }
    }

    @Override
    public void showWarning() {
        this.interrupt();
    }
}
