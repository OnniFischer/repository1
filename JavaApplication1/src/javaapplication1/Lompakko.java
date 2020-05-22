package javaapplication1;
import java.util.ArrayList;
import java.util.HashMap;

public class Lompakko {
   
//    private HashMap<Integer, Maksukortti> kortit = new HashMap<>();
    ArrayList<Maksukortti> kortit = new ArrayList<>();
    private double saldo;
    HashMap<Integer,Double> kuitit = new HashMap<>();
 
    
    public void lisaaKortti(Maksukortti kortti) {
        kortit.add(kortti);
    }
    
    public void lisaaKateista(Kateinen kateinen) {
        this.saldo = this.saldo + kateinen.getSaldo();
      
    }
    
    public void lisaaLompakkoon(int indeksi, double luku) {
        this.kuitit.put(indeksi,luku);
    }
    
    public void getArvo(Maksukortti kortti) {
        System.out.println(kortti.getSaldo());
    }
    
     public void tulostaKuitti() {
        for (double i : this.kuitit.keySet()) {
            System.out.println(this.kuitit.get(i));
        }
    }
    
    public ArrayList getKortit() {
        return kortit;
    }
    
}