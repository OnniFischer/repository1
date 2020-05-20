package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {

        Maksukortti kortti = new Maksukortti(15);

        kortti.otaRahaa(5);
        kortti.tulostaSaldo();

        kortti.lisaaRahaa(20);
        kortti.tulostaSaldo();
        kortti.otaRahaa(500);
        kortti.tulostaSaldo();
        
        kortti.otaRahaa(15);
        kortti.otaRahaa(82);
        
        kortti.tulostaOstokset();

    }

}
