package day28scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {


        //Example1: Kullanicidan bir dikdörgenin en ve boyunu alan ve cevresini hesaplayan kodu yzınız

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenarına giriniz....");
        int en= input.nextInt();

        System.out.println("Dikdörtgenn uzun kenarını giriniz...");
        int boy= input.nextInt();

        System.out.println("Alan : "  +  en*boy);

        System.out.println("Cevre : "  +  2*(en+boy));

    }


}