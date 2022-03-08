package org.groupa;

public class Tabungan {

    private String pemilik;
    private double saldo;

    //konstruktor
    public Tabungan(String namaPemilik, double saldoAwal) {
        pemilik = namaPemilik;
        saldo = saldoAwal;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        if (saldo >= 0)
            this.saldo = saldo;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    void penarikan(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            this.setSaldo(this.saldo - jumlah);
        }
    }

    void penyetoran(double jumlah) {
        if (jumlah > 0)
            this.setSaldo(saldo + jumlah);
    }
}
