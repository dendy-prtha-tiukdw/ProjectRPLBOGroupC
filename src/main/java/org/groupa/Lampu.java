package org.groupa;

import java.awt.*;

public class Lampu {
    private Color warna;

    public void gantiWarna(Color warnaBaru){
        warna = warnaBaru;
    }

    public Color warnaSekarang(){
        return warna;
    }

    public void nyala (){
        warna= Color.white;

    }

    public void mati(){
        warna = Color.BLACK;
    }

}
