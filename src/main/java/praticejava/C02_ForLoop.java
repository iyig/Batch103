package praticejava;

import day20ifstatement.İfStatement01;

public class C02_ForLoop {

/*
        Kullanicada 100'den kücük bir  tamsayi isteyin
        1'den başlayarak girilen sayiya kadar tüm sayiları yazdırın
        Ancak
        -Sayi 3'un kati ise sayi yerine "Java" yazdirın
        -Sayi 5'i kati ise sayi yerine "Güzeldir" yazdirın
        -Sayi hem 3'un kati hem 5'in kati ise sayi yerine "** Java Güzeldir **" yazdırın
         */

    public static void main(String[] args) {


        int sayi = 30;
        for (int i = 1; i <= sayi; i++) {

            if (i%3==0 && i%5==0) {
                System.out.println("** Java Güzeldir **");

            }else if(i%3==0) {
                System.out.println("Java");
            }else if (i%5==0){
                System.out.println("Güzeldir");
            }else System.out.println(i+ " ");


        }
    }
}
