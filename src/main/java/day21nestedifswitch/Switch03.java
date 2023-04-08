package day21nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
//Not: Switch de sadece int,short,char, String data tipleri kullanilabilir
        //Eger 3 den fazla durum varsa switch() tercih ederim
        //Kullanicidan işlem ve iki tane sayi  alarak işlemin sonucunu ekrana yazdıran basit bir hesap yapınız


        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz: +,-,*,/,%");
        char islem= input.next().charAt(0);

        System.out.println("ilk sayiyi giriniz");
        double ilk= input.nextDouble();


        System.out.println("ikinci sayıyı giriniz");
        double ikinci=input.nextDouble();

        switch (islem){
            case '+':
                System.out.println(ilk + ikinci);
                 break;

            case '-':
                System.out.println(ilk - ikinci);
                  break;
            case '*':
                System.out.println(ilk * ikinci);
                break;
            case '/':
                System.out.println(ilk / ikinci);
                break;
            case '%':
                System.out.println(ilk * ikinci/100);
                break;
            default:
                System.out.println("Bu islem tanımlanmamıştır");
        }
        }
        }









