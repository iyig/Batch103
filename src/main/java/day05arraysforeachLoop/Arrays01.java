package day05arraysforeachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    // Arraysleirn icine sadece primitiv data typeleri ve "reference (adres) yerleştirilebilir.

    public static void main(String[] args) {

        String str[]= new String[3];
        str[0]= "Java";
        str[1]= "did";
        str[2]="surprise you";

        System.out.println(Arrays.toString(str));


        //String bir Array olusturunuz ve "Tom" ve "Tom" dan önceki tüm elemanları ekrana yazdırıız

        String arr[]={"Jane","Mark","Christopher","Tom", "Ali", "Rojda"};

        for(String w : arr){

            System.out.println(w + " ");

            if (w.equals("Tom")){
                break;
            }

        }

        // Example 2:String bir Array olusturunuz ve "Tom" ve "Jane" haric  tüm elemanları ekrana yazdırıız
        String brr[]={"Jane","Mark","Christopher","Tom", "Ali", "Rojda"};

        for(String w :brr){

            if(w.equals("Jane") || w.equals("Tom")){
                continue;
            }
            System.out.println(w+ " ");

        }

  //example 3: Bir öpretmenin sinifındaki öğrencilerin isimlerini applcation'a yüklemsini sağlayan kodu yaznız
        //Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz

        Scanner input= new Scanner(System.in);
        System.out.println("Kaç öğrenci ismi gireceksiniz");
        int numofStd=input.nextInt();

        String names[]=new String[numofStd];
        System.out.println("Girisi sonlandırmak için Q harfinne basiniz.");


        for (int i = 1; i <=numofStd ; i++) {
            System.out.println("Lütfen" + i + ". öğrencinin ilk  ismini giriniz");

           String stdName= input.next();
          if(stdName.equalsIgnoreCase("Q")){
              break;
          }

            names[i-1]= stdName;



        }

        System.out.println(Arrays.toString(names));

    }

}
