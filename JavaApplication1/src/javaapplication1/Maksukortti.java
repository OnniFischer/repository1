/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.HashMap;

/**
 *
 * @author OnniFischer
 */
public class Maksukortti {

    private int saldo;
    private HashMap<Integer,Integer> ostokset = new HashMap<>();

    public Maksukortti(int saldo) {
        this.saldo = saldo;
    }

    public void otaRahaa(int luku) {
        int erotus = this.saldo - luku;
        int indeksi = 0;
        if (erotus > 0) {
            this.saldo -= luku;
            this.ostokset.put(0, luku);
            indeksi++;
        }
    }

    public void lisaaRahaa(int luku) {
        this.saldo += luku;
    }

    public void tulostaSaldo() {
        System.out.println(this.saldo);
    }
    
    public void tulostaOstokset() {
        for (int i : this.ostokset.keySet()) {
            System.out.println(this.ostokset.get(i));
        }
    }
    
    

}
