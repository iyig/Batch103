package praticejava;

import java.util.Scanner;

public class C013_WhileLoop {
/*

Kullanicidan toplamak üzere sayılar isteyin
sayi adei 10'u gecerse yada toplami 500'u gecerse
Bu kadar sayi yeter...adet sayi girdiniz toplami..."

 */
public static void main(String[] args) {
    Scanner input= new Scanner(System.in);


    int sayi=0;
    int toplam=0;
    int sayac=0;

    while(sayac<11 && toplam<500){
        System.out.println("Lütfen toplanmak üzere sayi giriniz");
sayi=input.nextInt();
toplam+=sayi;
        sayac++;

    }
if (toplam>500){
    System.out.println(sayac + "adet sayi girdini.Toplam "+toplam);
}else System.out.println("bu kadar sayi yeter." + sayac+"adet sayi girdiniz.Toplami" +toplam);
}
}
