package praticejava;

import java.util.Scanner;

public class C01_ForLoop {

//Kullanicidan başlangız, bitiş ve artış miktarini olarak
    // aradaki tüm sayiları aralarına virgül koyarak yazdırın


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println();

        int baslangic=10;
        int bitis=50;
        int artısMiktari=5;

        for (int i = baslangic; i <=bitis; i+=artısMiktari) {


            if(i<bitis){
                System.out.print(i+",");
            }else
                System.out.println(i);
        }
    }


}
