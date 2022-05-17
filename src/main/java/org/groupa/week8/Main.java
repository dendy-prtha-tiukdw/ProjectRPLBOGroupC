package org.groupa.week8;

public class Main {
    public static void main(String [] args){
        BecakMotor becakMotor = new BecakMotor();
        Thread thread = new Thread(becakMotor);
        thread.start();
    }
}
