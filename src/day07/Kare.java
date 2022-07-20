package day07;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Kare {
    public static void main(String[] args) {
        Scanner input=new Scanner(System .in);
        System.out.println("lütfen kenar uzunlugunu giriniz:");
        int kenar= input.nextInt();
        System.out.println("menü");
        System.out.println("1.alan hesapla");
        System.out.println("2.çevre hesapla");
        System.out.println("seciminiz:");
        int secim= input.nextInt();
        switch (secim){
            case 1 :
                int alan=kenar*kenar;
                System.out.println("alan="+alan);
                break;
            case 2:
                int cevre=kenar*4;
                System.out.println("Cevre="+cevre);
                break;
            case 3:
            default:
                    System.out.println("yalnış secim yaptınız.");

                break;


        }


    }



    }
