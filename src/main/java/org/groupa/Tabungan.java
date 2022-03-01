package org.groupa;

public class Tabungan {
    String pemilik;
    double saldo;

    //konstruktor
    public Tabungan(String namaPemilik, double saldoAwal){
        pemilik = namaPemilik;
        saldo = saldoAwal;
    }

    String getPemilik() {
        return pemilik;
    }

    double getSaldo() {
        return saldo;
    }

    void penarikan(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo = saldo - jumlah;
        }

    }

    void penyetoran(double jumlah) {
        if (jumlah > 0)
            saldo = saldo + jumlah;
    }
}
