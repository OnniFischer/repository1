package javaapplication1;

import java.util.HashMap;

public class Maksukortti {

    private int saldo;
    private HashMap<Integer, Integer> ostokset = new HashMap<>();

    public void otaRahaa(int luku) {
        int erotus =- luku;
        int indeksi = 0;
        if (erotus > 0 && erotus <= this.saldo) {
            this.saldo = this.saldo - luku;
            this.ostokset.put(indeksi, luku);
            indeksi++;
        } else {
            System.out.println("Arvoa ei voida vähentää kortilta.");
        }

    }

    public void lisaaRahaa(int luku) {
        this.saldo = this.saldo + luku;
    }

    public void tulostaOstokset() {
        for (int i : this.ostokset.keySet()) {
            System.out.println("Ostoksia: " + this.ostokset.get(i));
        }
    }
    
    public int getSaldo() {
        return this.saldo;
    }

}