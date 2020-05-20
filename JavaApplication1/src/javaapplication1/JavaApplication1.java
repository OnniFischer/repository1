package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Maksukortti kortti = new Maksukortti(5);
        Maksukortti kortti2 = new Maksukortti(0);
        Kateinen kateinen = new Kateinen();
        Lompakko lompakko1 = new Lompakko();
        lompakko1.lisaaKortti(kortti);
        lompakko1.lisaaKortti(kortti2);

        System.out.println("Kortti vai käteinen: (kortti) (kateinen)");
        String valinta = lukija.nextLine();

        if (valinta.equals("kortti")) {
            System.out.println("Komennot:");
            while (true) {
                System.out.println("lisaa - lisää rahaa kortille");
                System.out.println("ota - ota rahaa kortilta");
                System.out.println("tulosta - tulosta kortin arvo");
                System.out.println("lopeta - lopeta ohjelma");

                String input = lukija.nextLine();

                if (input.equals("lisaa")) {
                    System.out.print("Kuinka paljon lisätään? ");
                    int lisays = Integer.valueOf(lukija.nextLine());
                    kortti.lisaaRahaa(lisays);
                }

                if (input.equals("ota")) {
                    System.out.print("Kuinka paljon otetaan? ");
                    int otto = Integer.valueOf(lukija.nextLine());
                    kortti.otaRahaa(otto);
                }

                if (input.equals("tulosta")) {
                    kortti.tulostaOstokset();
                }

                if (input.equals("lopeta")) {
                    break;
                }

            }

        }

        if (valinta.equals("kateinen")) {
            System.out.println("Komennot:");
            while (true) {
                System.out.println("lisaa - lisää käteistä");
                System.out.println("ota - ota käteistä");
                System.out.println("tulosta - tulosta lompakon arvo");
                System.out.println("lopeta - lopeta ohjelma");

                String input = lukija.nextLine();

                if (input.equals("lisaa")) {
                    System.out.print("Kuinka paljon lisätään? ");
                    double lisays = Double.valueOf(lukija.nextLine());
                    kateinen.lisaaRahaa(lisays);
                }

                if (input.equals("ota")) {
                    System.out.print("Kuinka paljon otetaan? ");
                    int otto = Integer.valueOf(lukija.nextLine());
                    kateinen.otaRahaa(otto);
                }

                if (input.equals("tulosta")) {
                    System.out.println(kateinen.getSaldo());
                }

                if (input.equals("lopeta")) {
                    break;
                }

//        }
//
//        kortti.otaRahaa(5);
//        kortti.tulostaSaldo();
//
//        kortti.lisaaRahaa(20);
//        kortti.tulostaSaldo();
//        kortti.otaRahaa(500);
//        kortti.tulostaSaldo();
//
//        kortti.otaRahaa(15);
//        kortti.otaRahaa(82);
//        kortti.tulostaArvo(kortti);
            }
        }

    }
}
