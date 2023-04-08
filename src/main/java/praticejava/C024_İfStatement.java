package praticejava;

import java.util.Locale;
import java.util.Scanner;

public class C024_İfStatement {

/*
Kullanicidanbir gün alın
eger gün Cuma ise ekrana Müslümanlar için kutsal gün yazdırın
cumartesi ise ekrama yahudiler için kutsal gün yazdırın
pazar ise ekrana Hiristiyanlar için kutsal gun yazdırın
 */

    public static void main(String[] args) {
//Stringlerde == neden kullanılmaz.Onun yerine equals kullaniriz
Scanner input=new Scanner(System.in);
        System.out.println("Bir gün giriniz");
        String gün=input.next().toLowerCase();
        if(gün.equals("Cuma")){
            System.out.println("Muslümanlar  icin kutsal");
        }
        if(gün.equals("Cumartesi")){
            System.out.println("Yahudiler icin kutsal gün");
        }
    if (gün.equals("pazar")){
        System.out.println("Hiristiyanlar icin kutsal gün");
    }
    if (!gün.equals("cuma") && !gün.equals("Cumartesi") && !gün.equals("pazar")){
        System.out.println("kutsal gün degil");
    }
    }
}
