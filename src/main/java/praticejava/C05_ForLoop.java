package praticejava;

import java.util.Scanner;

public class C05_ForLoop {
/*

Kullanicıdan alinan bir Stringin ilk ve son harfini yine kullanicıdan alınan sayi kadr
tekrarlayan kodu yazınız
örnek   : input                output
*           elma  2             eaea
               army 3        ayayay
 */



    public static void main(String[] args) {

    Scanner input  =new Scanner(System.in);
        System.out.println("Lüten bir kelime giriniz");
        String kelime=input.nextLine();

        System.out.println("Kaç kez tekrarlanmasini istiyorsanız giriniz");
        int tkrSayisi=input.nextInt();
 String ilkSonHarf=kelime.substring(0,1) + kelime.substring(kelime.length()-1);

String cikti="";
        for (int i = 1; i <=tkrSayisi ; i++) {
            cikti+=ilkSonHarf;
        }
        System.out.println(cikti);

    }
}