package day20ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    /*
    İki tane String'in biribirine eşit olup olmadığını anlamak için "==" değil  "equals() kullaniniz

     */
    public static void main(String[] args) {
        // Example 1: Kullanicidan gün isimlerini aliniz o günü hafta sonu mu hafta ici mi olduğunu kullaniciya
        //söyleyeniz


        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz");
        String gun = input.next();

//1.YOl
        if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("Pazartesi")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("Sali")) {
            System.out.println("Hafta içi");
        } else if (gun.equalsIgnoreCase("Carşamba")) {
            System.out.println("Hafta içi...");

        } else if (gun.equalsIgnoreCase("Perşembe")) {
            System.out.println("Hafta içi");
        } else if (gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta içi");
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu");
        } else {
            System.out.println("Geçerli bir gün ismi giriniz");
        }


        //2.Yol

        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Hafta sonu....");
        } else if (gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carşamba") ||
                gun.equalsIgnoreCase("Perşembe") ||
                gun.equalsIgnoreCase("Cuma")){

            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gün ismi giriniz");
        }
// 3.Yol
      boolean haftaSonu=  gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");
     boolean haftaIci=gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carşamba") ||
                gun.equalsIgnoreCase("Perşembe") ||
                gun.equalsIgnoreCase("Cuma");
        if (haftaSonu) {
            System.out.println("Hafta sonu....");
        } else if (haftaIci){
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gün ismi giriniz");
        }
    }
}




