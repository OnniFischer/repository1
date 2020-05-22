/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;


public class Kayttoliittyma {

//    private Maksukortti kortti;
//    private Scanner lukija = new Scanner(System.in);

    public void kaynnista() {

        Scanner lukija = new Scanner(System.in);
        Maksukortti kortti = new Maksukortti();
        Maksukortti kortti2 = new Maksukortti();
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
                    System.out.println(kortti.getSaldo());
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
                    double otto = Double.valueOf(lukija.nextLine());
                    kateinen.otaRahaa(otto);
                }

                if (input.equals("tulosta")) {
                    System.out.println(kateinen.getSaldo());
                }

                if (input.equals("lopeta")) {
                    break;
                }

            }
        }
    }
}
