package org.groupa;

import java.awt.*;

public class Main {

    public static void main(String[] args){

//        Lampu lampu1 = new Lampu();
//        lampu1.gantiWarna(Color.BLUE);
//        System.out.println(lampu1.warnaSekarang());
//        lampu1.mati();
//        System.out.println(lampu1.warnaSekarang());
//        lampu1.nyala();
//        System.out.println(lampu1.warnaSekarang());

//        Tabungan tabunganGerhut = new Tabungan("gerhut",300);
//        System.out.println(tabunganGerhut.getSaldo());
//        System.out.println(tabunganGerhut.getPemilik());
//
//        Tabungan tabunganIvan = new Tabungan("Ivan",1200);
//        System.out.println(tabunganIvan.getSaldo());
//        System.out.println(tabunganIvan.getPemilik());
//        tabunganIvan.penyetoran(300);
//        System.out.println(tabunganIvan.getSaldo());
//        tabunganIvan.penarikan(-500);
//        System.out.println("Sado akhir Ivan : "+tabunganIvan.getSaldo());
//
//        tabunganGerhut.penarikan(150);
//        System.out.println(tabunganGerhut.getSaldo());
//        tabunganGerhut.penyetoran(-1000);
//        System.out.println("Sado akhir Gerhut : "+tabunganGerhut.getSaldo());


        Lampu lampuHitam = LampuFactory.getInstance().createLampu(LampuFactory.LAMPU_HITAM);
        Lampu lampuMerah = LampuFactory.getInstance().createLampu(LampuFactory.LAMPU_MERAH);
        Lampu lampuNdakJelas = LampuFactory.getInstance().createLampu(10);

        System.out.println(lampuHitam.warnaSekarang());
        System.out.println(lampuMerah.warnaSekarang());
        System.out.println(lampuNdakJelas.warnaSekarang());
    }

    public static int findMax(int arr[]){
        int max= 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}

