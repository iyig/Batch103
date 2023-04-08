package praticejava;

import java.util.Scanner;

public class C03_ForLoop {

    /*
Kullanicidan bir cümle ve bir harf alın
cümlede verilen harfin kac kere
kullanıldığını bulup yazdırın

INPUT:Cumle:Java ogrenmek cok güzel. ==>Harf:e
OutPut: Girdiğiniz cumlede "e" harfi 3 kere kullanılmış
          */


    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle= input.nextLine().toLowerCase();

        System.out.println("Lutfen saydırmak istediğiniz harfi giriniz");
        char harf= input.next().toLowerCase().charAt(0);

int sayac=0;


        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)==harf){
                sayac++;
            }

        }
        System.out.println("Girdiniz cumlede " + harf+ "harfi" + sayac  + "tanedir");
    }


}
