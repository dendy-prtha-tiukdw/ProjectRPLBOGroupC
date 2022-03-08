package org.groupa;

import java.awt.*;

public class LampuFactory {

    //konstanta
    public static final int LAMPU_MERAH = 0;
    public static final int LAMPU_PUTIH = 1;
    public static final int LAMPU_HITAM = 2;

    private static LampuFactory instance;

    //konstruktor
    private LampuFactory() {

    }

    //pola desain : singleton
    public static LampuFactory getInstance() {
        if (instance == null) {
            instance = new LampuFactory();
        }
        return instance;
    }

    public Lampu createLampu(int warnaLampu) {
        Lampu lampu = new Lampu();
        switch (warnaLampu) {
            case LAMPU_MERAH:
                lampu.gantiWarna(Color.red);
                break;
            case LAMPU_PUTIH:
                lampu.gantiWarna(Color.white);
                break;
            case LAMPU_HITAM:
                lampu.gantiWarna(Color.black);
                break;
            default:
                lampu.gantiWarna(Color.white);
                break;
        }
        return lampu;
    }
}
