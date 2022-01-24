package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }


    public void run() throws InterruptedException {

        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);

        }
    }

    public void move() {
        for (Horse hors : horses) {
            hors.move();
        }
    }

    public void print() {
        for (Horse hors : horses) {
            hors.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

    }

    public Horse getWinner() {
        Horse result = horses.get(0);
        for (Horse horse : horses) {
            if (horse.getDistance() > result.getDistance())
                result = horse;
        }
        return result;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {

        List<Horse> horses = new ArrayList<>(Arrays.asList(new Horse("Puma", 3, 0)
                , new Horse("Zuma", 3, 0)
                , new Horse("Ruma", 3, 0)));

        Hippodrome hippodrome = new Hippodrome(horses);
        game = hippodrome;
        game.run();
        game.printWinner();

    }
}
