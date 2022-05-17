package org.groupa.week8;

public class BecakMotor extends Becak implements Vehicle, Runnable{
    @Override
    public void startEngine() {

    }

    @Override
    public void run() {
        while (true){
            System.out.println("becak lari2");
        }

    }
}
