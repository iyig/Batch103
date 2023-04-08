package praticejava;

import java.util.Scanner;

public class C021_Scanner1 {

/*
Örnek:Inputs:853
output:Girdiniz sayinin birler basamağı:3
Girdiniz sayinin onlar basamapı:5
Girdiniz sayinin yüzler basamağı:8


 */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayi girniz");
        int sayı= input.nextInt();

        // 1) 1 ler basamapındaki sayiyi bulun

        int birler= sayı%10;
        System.out.println("girndiniz sayinin birler basamağı"+ birler);

        // sayi=sayi/10

         sayı/=10;
        System.out.println("ikiBas =" + sayı);

        // 10 lar basamağındaki sayıyı bulun

        int onlar= sayı%10;
        System.out.println("girdiniz sayinin onlar basağı" + onlar);
        sayı/=10;

        // 100 ler basamağındaki sayıyı bulun
        int yuzler =sayı;
        System.out.println("girdiniz sayinin yuzler basamağı" + yuzler);




    }

}
