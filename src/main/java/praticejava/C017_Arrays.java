package praticejava;

import java.util.Locale;
import java.util.Scanner;

public class C017_Arrays {


      /*


      Interview

      Kullanicinin yazdığı metni, 'hacker'ların konuşma diline çeviren kodu yazınız
      Hackerler bazı harfleri sayılara cevirerek yazışabilryorlar.Genellikle çevirdikleri harfler şu şekilde

      s -> 5
      a ->4
      e ->3
      i ->1
      o->0
      Test data
      hackerDili("java ile hersey guzel")
      j4v4 1l3 h3r53y guz2l
      İpucu harfleri değiştirin ve ekrana yazınız
       */
      public static void main(String[] args) {

          Scanner input =new Scanner(System.in);
          System.out.println("Lütfen bir cumle giriniz");
          String cumle=input.nextLine().toLowerCase();

          String arr[]=new String[cumle.length()];

          for (int i=0;i<cumle.length();i++){
              arr[i]=cumle.substring(i,i+1);
              System.out.print(arr[i]);

          }
          System.out.println();

          for (int i = 0; i < cumle.length(); i++) {
              if (arr[i].contains("s")){
                  arr[i]="5";
              }
              if (arr[i].contains("a")){
                  arr[i]="4";
              }
              if (arr[i].contains("e")){
                  arr[i]="3";
              }
              if (arr[i].contains("i")){
                  arr[i]="1";
              }
              if (arr[i].contains("o")){
                  arr[i]="0";
              }

              System.out.print(arr[i]);


          }




    }


}
