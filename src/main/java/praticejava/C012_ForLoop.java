package praticejava;

import java.util.Scanner;

public class C012_ForLoop {
    /*
    Girilen bir stringin harflerini teker teker ekrana ailt alta olacak
    şekilde yazdırınız. boşluk veya a harfi geldiğinde bunları yazmasın

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen String bir ifade giriniz");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {// ifadenin karakterlerini bakıidı
            if (str.charAt(i) == 'a' || str.charAt(i) == ' ') {// ifade^de a yada bosluk görürsen atla
                continue;

            }

            System.out.println(str.charAt(i));
        }

    }

}