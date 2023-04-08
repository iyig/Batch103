package day19ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        /*

        Kullanicıdan ilk orta ve soy ismini aliniz ve aşağıdaki formeatta ekrana yazdri
        Ali Mert Can
        123456789
         */

  Scanner input=new Scanner(System.in);

       //1.YOl

        System.out.println("Ilk isminizi girinz....?");
        String ilkIsim=input.next();// next() methodu kullanicıdan String data almak için kullanılır

        System.out.println("Orta isminizi giriniz....?");
        String ortaIsim= input.next();

        System.out.println("Soy isminizi giriniz....?");
        String soyIsim=input.next();

        System.out.println("Kimlik numaranizi giriniz...?");
        String kimlikNo=input.next();

        System.out.println(ilkIsim+ " " +ortaIsim+ " " + soyIsim);
        System.out.println(kimlikNo);

        //2.yol
        System.out.println("İlk ,orta ve soy isminizi ve kimlik giriniz.....");
        String ilk =input.next();
        String orta=input.next();
        String soy=input.next();
        String kimlik=input.next();

        System.out.println(ilkIsim+ " " +ortaIsim+ " " + soyIsim);
        System.out.println(kimlikNo);


        /*

        next() ile nextLine() in farki nedir
        next()metohodu kullanicıdan gelen String 'in sadece ilk kelimesini alir
        nextLİne() methodu kullanicıdan gelen String'in tamaminı alir
         */
//3.Y0l
        System.out.println("İlk,orta ve soy isminizi giriniz");
        String tamIsim=input.nextLine();
        System.out.println(tamIsim);

        System.out.println("Kimlik numaranizi giriniz");
        String kimlikNumarasi=input.next();
        System.out.println(kimlikNumarasi);

  //Windows==> ctrl + /

    }


}
