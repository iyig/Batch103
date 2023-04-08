package day19ifstatement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner02 {
/*

Not: Char variable'lari matematiksel islemlerde kullanırsaniz, Java onların ASCII değerlerini kullanır
Ornegin: Sysem.out.println('A' + 'C') ekrana AC yerine 132 yazdırır
Note: Java'da "+" sembolunun iki anlami vardır
i)Toplama islmei
ii)Birleştırme Islemi(Concatenation)
Java "+" sembolu görünce önce toplama yapmaya çalşır yapamazsa birleştirme işlemi yapmaya calışır o da olmazsa
hata verir.
 */
    public static void main(String[] args) {
        //Example1= Kullanicıdan ilk ve soy ismini aliniz ilk ve soy ismini ilk harflerni ekrana yazdır
        // Ali Can==> AC


        Scanner input= new Scanner(System.in);
        System.out.println("İLk isminizi giriniz....");
        char ilk=input.next().charAt(0);

        System.out.println("Soy isminizi giriniz...");
        char son=input.next().charAt(0);

        System.out.println(""+ilk + son);

//2.YOL
        System.out.println("Tam isminizi giriniz");
        String tamIsmi= input.nextLine();// Ali Can

        char ilkHarf=tamIsmi.charAt(0);
        System.out.println(ilkHarf);// A

        char soyIsminIlkHarfi=tamIsmi.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);

    }

}
