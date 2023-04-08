package day20ifstatement;

import java.util.Scanner;

public class İfStatement01 {

    public static void main(String[] args) {
        //Example1: Kullanicidan alinan sayinin tek mi cift mi olduğunu ekrana yazan kodu
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi giriniz...");
        int s =input.nextInt();

        if (s%2==0){
            System.out.println("Çift sayi....");



        }

        // "!=" demek "esit değil" demektir
        if (s%2!=0){
    System.out.println("Tek sayi....");
}

//2.Yol
        if (s%2==0){
            System.out.println("Cift sayi...");
        }else{
            System.out.println("Tek sayi...");
        }
//Example 2: Bir sayinin negatif pozitif veya nötr olduğunu söylen kodu yaziniz

        System.out.println("Bir sayi giriniz");
        double d=input.nextDouble();

        if (d>0){
            System.out.println("Pozitif");
        }else if(d==0){
            System.out.println("Nötr");

        }else{
            System.out.println("Negatif");
        }

    }
}
