package day04Loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        // Example 1: Kullanıcıdan bir sayı alınız, sayı 100 den kücük ise ekrana "kazandın!" yazdırınız
        //aksi halde ekrana "kaybettin!" yazdırınız
        // kullanıcı kazandıkca oyun devam etmeli


        Scanner input = new Scanner(System.in);
int sayi=0;
       do {
           System.out.println("Bir sayı giriniz");
            sayi= input.nextInt();
                   if(sayi<100){
                       System.out.println("Kazandınız");
                   }
       }while(sayi<100);
        System.out.println("kaybettiniz");


// Example 2: Kullanicıdanisminin alınız ilk harfının büyük harf olup olmadıgını kontrol ediniz
do {
    System.out.println("Isim giriniz");
    char ilkHarf= input.next().charAt(0);


    if (ilkHarf>='A' && ilkHarf<='Z'){
        System.out.println("Ismi basariyla girdiniz");


    }else{
        System.out.println("ismi yanlış girdiniz için isleminiz iptal edilmiştir");
        break;
    }
}while(true);


   //Infinite loop: sonsuz döngü

    }
}

