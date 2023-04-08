package praticejava;

import java.util.Scanner;

public class C021_Scanner {
    public static void main(String[] args) {


        //Soru: Kullanıcıdan aldığınız şekille aşağıdaki gibi bir görünüm olusturun
        /*
                             A
                            A  A
                           A  A  A


         */



       Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

      char ch=  input.next().charAt(0);
        System.out.println("  " +ch + "  ");
        System.out.println(" " +ch+ " " + ch+ " ");
        System.out.println(ch +" " + ch + " " +ch);
    }



}
