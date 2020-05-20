package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Maksukortti kortti = new Maksukortti(15);

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
            }

            if (input.equals("ota")) {
                System.out.print("Kuinka paljon otetaan? ");
                int otto = Integer.valueOf(lukija.nextLine());
            }

            if (input.equals("tulosta")) {
                
                kortti.tulostaArvo(kortti);
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
//        kortti.tulostaOstokset();
        }

    }
