package javaapplication1;
import java.util.HashMap;

/*
Tänne samantyylinen luokka kuin Maksukortti,
mutta saldon tulee olla viiden sentin tarkkuudella.
Tee Lompakko-luokka, jolle voi luoda maksukortteja ja käteisolion.
Kortilla maksaessa kuitit (ostoslista) tallentuvat maksukortille,
käteisellä maksaessa kuitit tallentuvat Lompakkoon.
 */

public class Kateinen {

    private double saldo;
    private HashMap<Integer, Integer> ostokset = new HashMap<>();
    private Lompakko lompakko;
    

    public void otaRahaa(int luku) {
        double erotus = this.saldo - luku;
        int indeksi = 0;
        if (erotus > 0 && erotus < this.saldo) {
            this.saldo = this.saldo - luku;
            this.lompakko.lisaaLompakkoon(indeksi, luku);
            indeksi++;
        } else {
            System.out.println("Arvoa ei voida vähentää.");
        }

    }

    public void lisaaRahaa(double luku) {
        this.saldo = this.saldo + luku;
    }

    public void tulostaOstokset() {
        for (int i : this.ostokset.keySet()) {
            System.out.println(this.ostokset.get(i));
        }
    }
    
    public double getSaldo() {
        return 1.0 * this.saldo;
    }

}