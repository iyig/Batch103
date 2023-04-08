package praticeadvance;

import java.util.Scanner;

public class Q01_For_Continue {
/*

Kullanicidan 5 adet sayı isteğiniz
Bu sayılardan 5 ile 10 arasındakiler hariç diğerlerinin toplamını bulunuz
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int toplam=0;
int sayac=0;
        for (int i = 0; i <= 5; i++) {
            System.out.println("Bir sayi giriniz");

           int sayi =input.nextInt();

           if (sayi>5 && sayi<10){
               System.out.println("Girdiniz sayi 5 ile 10 arasında olduğundan işlem alınmamıştır");
               continue;
           }

      toplam+=sayi;
       sayac++;
        }
        System.out.println(sayac + "adet sayi girdini.Toplam "+toplam);
      //  System.out.println("toplam"+ toplam);

    }
}

