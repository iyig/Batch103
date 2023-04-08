package praticejava;

import java.util.Scanner;

public class C022_Scanner2 {

    public static void main(String[] args) {
      /*
      Soru3:

      Kullanicıdan alacağınız 5 basamklı sayinin ilk 2 ve son iki basamğındaki rakamları toplamını bulunu
      input:   12345 ==> 1+2+4+5=12

       */

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamaklı bir sayi girniz");
        int sayi= input.nextInt();
        int ilkIkirkm=sayi/1000;

        int ilkIkiTop=(ilkIkirkm%10)+(ilkIkirkm/10);

        int sonIkiRkm=sayi%100;
int sonIkiTop=(sonIkiRkm%10)+(sonIkiRkm/10);
        int toplam=ilkIkiTop+sonIkiTop;
        System.out.println(toplam);





    }





}
