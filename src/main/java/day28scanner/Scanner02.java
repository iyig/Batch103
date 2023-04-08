package day28scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {



//Example 1: Sayiları kullanicidan alan ve toplama işlemi yapan kodu yazınız
    //1.Adım: Scanner Classından object olustur
    Scanner input=new Scanner(System.in);
    //2.AdıM: Kullaniciya ne yapacağını söyle
        System.out.println("ilk sayiyi giriniz....");
        double sayi1 = input.nextDouble();

        System.out.println("İkinci sayiyı giriniz");
        double sayi2=input.nextDouble();

        System.out.println(sayi1 + sayi2);

}
}