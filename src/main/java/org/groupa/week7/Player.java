package org.groupa.week7;

public class Player extends Agent {
    public int id;

    public Player() {
        super(0);

        System.out.println("Player dibuat");
    }

    public void process_input() {

    }

    public void attack(Agent other) {
        System.out.println("Attack Player");
    }
}
