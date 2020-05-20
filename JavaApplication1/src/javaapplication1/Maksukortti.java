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
            this.ostokset.put(indeksi, luku);
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
    
    public void tulostaArvo(Maksukortti kortti) {
        System.out.println(kortti.toString());
    }

    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa.";
    }
}