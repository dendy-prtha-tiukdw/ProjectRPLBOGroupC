package org.groupa.week7;

public class Agent extends Object {
    public int health;
    public int strength;
    public String name;
    public Weapon current_weapon;

    public Agent(){
        System.out.println("Agent dibuat");
    }

    public Agent(int health){
        System.out.println("Agent dgn contructor 2 dibuat");
        this.health = health;
    }
    public void walk_one_step(int direction){

    }

    public void attack(Agent other){
        System.out.println("Attack Agent");
    }
}